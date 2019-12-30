package com.example.spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * zuul过滤器
 */
@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 返回一个字符串代表过滤类型，在zuul中定义了四种不同的生命周期的过滤器类型
     * pre：路由之前
     * routing：路由之时
     * post：路由之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤具体业务代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        HttpServletResponse response = ctx.getResponse();
//        String loginUrl = request.getContextPath() + "/system";
//        Object userName = request.getSession().getAttribute("currentUserName");
//        if(userName == null || userName.toString().equals("")) {
//            ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
//            ctx.setResponseStatusCode(401);// 返回错误码
////			ctx.setResponseBody("{\"result\":\"username is not correct!\"}");// 返回错误内容
//            String str = "<script language='javascript'>alert('会话过期,请重新登录');"
//                    + "window.top.location.href='"
//                    + loginUrl
//                    + "';</script>";
//            ctx.setResponseBody(str);
//            response.setContentType("text/html;charset=UTF-8");// 解决中文乱码
//            ctx.set("isSuccess", false);
//            return null;
//        } else {
//            ctx.setSendZuulResponse(true);// 对该请求进行路由
//            ctx.setResponseStatusCode(200);
//            //ctx.set("isSuccess", true);// 设值，让下一个Filter看到上一个Filter的状态
//            return null;
//        }
        return null;
    }
}
