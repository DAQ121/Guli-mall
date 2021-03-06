
# Guli-mall
谷粒商城练习

## 第一天:（注册中心与远程调用）

- 搭建项目结构，整合人人开源框架，管理系统的前后台运行成功，并根据代码生成器生成各层模板。并整合mybatis_plus
- 配置nacos服务注册与发现，将各个服务注册到nacos中
- 测试服务之间的远程调用,出现的问题与解决（调用不成功，由于服务没有注册进nacos，依赖包需要对应上版本号）
1. 引入oprn-fegin
2. 编写一个接口，告诉springcloud，这个接口需要远程调用服务。
3. 声明接口中的每一个方法都是哪个远程服务调用的那个请求
-  @EnableFeignClients开启远程调用功能(只要一启动，就去自动扫描这个包下所有标明了feginclient的方法)

## 第二天：（配置中心）

- nacos的配置中心，动态的获取application中配置，任何配置文件都可以放到配置中心中，需要在bootstrap.properties中说明需要加载哪些配置文件即可。配置中心中有的，优先使用配置中心的。
1. 添加nacos配置中心的依赖，将所有的配置搬到application.properties中
2. 在使用到这些配置controller中上加注解@RefreshScope。
3. 在nacos中手动添加配置，实现动态更新。
-  **命名空间** 做环境隔离，在配置文件中加入namespace地址，配置nacos中命名空间的ID（可以基于环境做隔离，也可基于微服务之间做隔离）
- **配置分组** 在nacos中创建配置的时候，指定了配置分组，也需要在代码的配置文件中指定配置分组
- **加载多配置文件**：将一个大的Application.yml拆分成几个服务配置（数据源，框架等），在项目中启动的时候，就要去加载这些配置文件。`spring.cloud.nacos.config.extension-configs[0].data-id=`，还需要指定group，以及是否动态刷新。

## 第三天：（网关）
- 网关作为流量的入口，常用功能：路由转发，权限检验，限流控制，cloud官方推出的gateway，取代了zuul
- 网关的其他配置相同，主要是断言的配置，相当于一个过滤器。满足断言规则的，即可路由到相应的路径
