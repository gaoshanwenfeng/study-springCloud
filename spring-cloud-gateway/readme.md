1、application.yml 文件属性说明

#spring.cloud.gateway.discovery.locator.enabled：是否与服务注册于发现组件进行结合，
#通过 serviceId 转发到具体的服务实例。默认为false，设为true便开启通过服务中心的自动根据 serviceId 创建路由的功能        

#spring.cloud.gateway.routes用于配合具体的路由规则，是一个数组。这里我创建了一个 id 为default_path_to_http的路由，
#其中的配置是将未匹配的请求转发到https://windmt.com。
#实际上开启了服务发现后，如果只使用默认创建的路由规则，这个 routes 不配置也是可以的，所以我就先注释掉了不用它了