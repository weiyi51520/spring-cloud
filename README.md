# spring-cloud
study for spring-cloud

1-simple-provider-and-consumer

provider 服务提供者 (服务的被调用方)
consumer 服务消费者 (服务的调用方)
这是一个简单服务提供者和服务消费者的demo
服务提供者使用RestTemplate 通过硬编码(ip+port)的http请求方式调用提供者服务

2-eureka

通过 服务消费者-服务注册中心-服务提供者 结构利用服务发现组件解决硬编码问题
服务消费者向 服务注册中心 注册服务和发送心跳 
服务提供者向 服务注册中心 注册服务
服务注册中心 完成请求处理并调用服务

服务注册表:服务注册表是一个记录当前可用服务实例的网络信息的数据库，是服务发现机制的核心。服务注册表提供查询API和管理API，使用查询API获得可用的服务实例，使用管理API实现注册和注销；

服务注册:服务注册很好理解，就是服务启动时，将服务的网络地址注册到服务注册表中；

健康检查:服务发现组件会通过一些机制定时检测已注册的服务，如果发现某服务无法访问了（可能是某几个心跳周期后），就将该服务从服务注册表中移除。

服务发现的方式:客户端发现:ZK Eureka 服务器端发现:Consul nginx

microservice-discovery-eureka-ha 配置高可用的eureka集群

3-ribbon
microservice-consumer-movie-ribbon 的基本使用
microservice-consumer-movie-ribbon-properties-customizing 通过代码自定义配置使用ribbon
microservice-consumer-movie-ribbon-without-eureka Ribbon与Eureka分离调用provide

4-feign
microservice-consumer-movie-feign Feign的简介及基础使用
microservice-consumer-movie-feign-customizing 覆写feign的默认配置及使用feign的日志
