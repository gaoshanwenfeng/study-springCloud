package com.myapp.apigateway.fiter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreAuthorZuulFilter extends ZuulFilter {

	private Log log = LogFactory.getLog(PreAuthorZuulFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		log.info("******>>>>>>>>");

		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		String token = request.getParameter("token");
		if (token == null || token.isEmpty()) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			ctx.setResponseBody("token is empty");
		}
		return ctx;

	}
	
    /**
     * 判断该过滤器是否需要被执行。这里我们直接返回了true，因此该过滤器对所有请求都会生效。
     * 实际运用中我们可以利用该函数来指定过滤器的有效范围。
     *
     * @return
     */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	 /**
     * filter执行顺序，通过数字指定。
     * 数字越大，优先级越低。
     *
     * @return
     */
	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
