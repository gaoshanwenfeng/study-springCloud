1、Zuul 中默认实现的 Filter
类型 	顺序 	过滤器 	功能
pre 	-3 	ServletDetectionFilter 	标记处理 Servlet 的类型
pre 	-2 	Servlet30WrapperFilter 	包装 HttpServletRequest 请求
pre 	-1 	FormBodyWrapperFilter 	包装请求体
route 	1 	DebugFilter 	标记调试标志
route 	5 	PreDecorationFilter 	处理请求上下文供后续使用
route 	10 	RibbonRoutingFilter 	serviceId 请求转发
route 	100 	SimpleHostRoutingFilter 	url 请求转发
route 	500 	SendForwardFilter 	forward 请求转发
post 	0 	SendErrorFilter 	处理有错误的请求响应
post 	1000 	SendResponseFilter 	处理正常的请求响应


2、Zuul 大部分功能都是通过过滤器来实现的，这些过滤器类型对应于请求的典型生命周期。

PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用 Apache HttpClient 或 Netfilx Ribbon 请求微服务。
POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的 HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
ERROR：在其他阶段发生错误时执行该过滤器。 除了默认的过滤器类型，Zuul 还允许我们创建自定义的过滤器类型。例如，我们可以定制一种 STATIC 类型的过滤器，直接在 Zuul 中生成响应，而不将请求转发到后端的微服务。

3、禁用指定的 Filter
可以在 application.yml 中配置需要禁用的 filter，格式为zuul.<SimpleClassName>.<filterType>.disable=true。
比如要禁用org.springframework.cloud.netflix.zuul.filters.post.SendResponseFilter就设置

zuul:
  SendResponseFilter:
    post:
      disable: true

4、自定义一个 Filter，继承 ZuulFilter 抽象类



