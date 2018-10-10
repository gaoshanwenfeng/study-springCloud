
Spring Cloud Bus做配置更新步骤如下:
    1、提交代码触发post请求给/actuator/bus-refresh 
    2、server端接收到请求并发送给Spring Cloud Bus
    3、Spring Cloud bus接到消息并通知给其它客户端
    4、其它客户端接收到通知，请求Server端获取最新配置
    5、全部客户端均获取到最新的配置
    
通过使用 [POST]方式请求client端刷新加载配置 http://localhost:9204/actuator/bus-refresh 

