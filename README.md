# Guli-mall
谷粒商城练习

第一天:
1. 搭建项目结构，整合人人开源框架，管理系统的前后台运行成功，并根据代码生成器生成各层模板。并整合mybatis_plus
2. 配置nacos服务注册与发现，将各个服务注册到nacos中
3. 测试服务之间的远程调用,出现的问题与解决（调用不成功，由于服务没有注册进nacos，依赖包需要对应上版本号）
- 引入oprn-fegin
- 编写一个接口，告诉springcloud，这个接口需要远程调用服务。
- 声明接口中的每一个方法都是哪个远程服务调用的那个请求
- @EnableFeignClients开启远程调用功能(只要一启动，就去自动扫描这个包下所有标明了feginclient的方法)

第二天：
1. 配置nacos的配置中心，动态的获取application中配置，需要加注解@RefreshScope2
