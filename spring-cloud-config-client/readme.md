1、
因为 Spring Cloud Config 分服务端和客户端，服务端负责将 Git 中存储的配置文件发布成 REST 接口，客户端可以从服务端 REST 接口获取配置。
但客户端并不能主动感知到配置的变化，从而主动去获取新的配置。
客户端如何去主动获取新的配置信息呢，Spring Cloud 已经给我们提供了解决方案，每个客户端通过 POST 方法触发各自的 /actuator/refresh

仅修改客户端即 config-client 项目，就可以实现 refresh 的功能

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

增加了spring-boot-starter-actuator包，spring-boot-starter-actuator是一套监控的功能，可以监控程序在运行时状态，
其中就包括/actuator/refresh的功能.
需要给加载变量的类上面加载@RefreshScope，在客户端执行/actuator/refresh的时候就会更新此类下面的变量值



http://localhost:9201/actuator/refresh 