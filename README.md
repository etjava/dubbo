# dubbo - Hello World
dubbo的简单应用

## 案例需求：order在启动时根据用户ID查询用户信息
### common 为公共API模块 该模块下存放的是java bean ，及其他模块需要用到的service接口 工具类等
### userProvider 为服务提供者模块 用来将服务注册到zookeeper中
### orderConsumer 服务的消费者 模块启动时调用注册中心指定的服务(comsumer.xml中指定了调用的是哪个服务)
### incubator-dubbo-ops-master.zip 是dubbo用于管理注册中心服务的可视化工具(v2.6) 该版本的使用后续会补充详细说明
### 
