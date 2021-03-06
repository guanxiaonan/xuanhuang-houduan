package com.gyn.gateway.adapter;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyn.gateway.Constant.Constant;
import com.gyn.gateway.pojo.MonitorParam;
import com.gyn.gateway.service.MonitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    private static Logger logger = LoggerFactory.getLogger(InterceptorConfig.class);

    @Autowired
    MonitorService monitorService;

    @Bean
    public InterfaceAuthCheckInterceptor getInterfaceAuthCheckInterceptor() {
        return new InterfaceAuthCheckInterceptor();
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 多个拦截器组成一个拦截器链
//        // addPathPatterns 用于添加拦截规则
//        // excludePathPatterns 用户排除拦截
//        //registry.addInterceptor(getInterfaceAuthCheckInterceptor()).addPathPatterns("/api/**");
////        registry.addInterceptor(new InterfaceAuthCheckInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/login/**");
//        registry.addInterceptor(new InterfaceAuthCheckInterceptor()).addPathPatterns().excludePathPatterns("/**");
//        // 如果interceptor中不注入redis或其他项目可以直接new，否则请使用上面这种方式
//        super.addInterceptors(registry);
//    }

    /**
     * 解决跨域问题 1-20
     */
    @Bean
    public FilterRegistrationBean corsFilterRegistration(){
        FilterRegistrationBean registration  = new FilterRegistrationBean();
        registration.setFilter(corsFilter());
        registration.addUrlPatterns("/*"); //过滤应用程序中所有资源,当前应用程序根下的所有文件包括多级子目录下的所有文件，注意这里*前有“/”
        registration.setName("corsFilter");
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registration;
    }

    public Filter corsFilter() {
        return new CorsFilter();
    }
//     解决跨域问题 1-20


    /**
     * 微服务间接口访问密钥验证
     * @author xiaochangwei
     *
     */
    class InterfaceAuthCheckInterceptor implements HandlerInterceptor {

        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2, Exception arg3)
                throws Exception {
            String user = (String)request.getSession().getAttribute("user");
            if (user != null) {
                MonitorParam monitor = new MonitorParam();
                monitor.setCallUser(user.split("\\|")[0]);

                HandlerMethod hander = (HandlerMethod)arg2;
                String callMethod = hander.getMethod().getName();
                monitor.setCallMethod(callMethod);

                Object bean = hander.getBean();
                Class<?> aClass = bean.getClass();
                String name = aClass.getName();
                //todo 获取服务名
                if (name.contains("User")) {
                    monitor.setServiceName(Constant.USER_SERVICE);
                    addCallRecord(monitor);
                } else if(name.contains("Inventory")) {
                    monitor.setServiceName(Constant.INVENTORY_SERVICE);
                    addCallRecord(monitor);
                } else if (name.contains("Task")) {
                    monitor.setServiceName(Constant.PRODUCE_TASK_SERVICE);
                    addCallRecord(monitor);
                } else if (name.contains("Material")) {
                    monitor.setServiceName(Constant.MATERIAL_SERVICE);
                    addCallRecord(monitor);
                } else if (name.contains("Monitor")){
                    logger.info("监控控制器");
                } else {
                    logger.info("未指定监控指标！{}",name);
                }
            }
        }

        private void addCallRecord(MonitorParam monitor) {
            monitor.setCallTime(new Date());
            monitorService.addCallRecord(monitor);
            logger.info("after: 添加调用记录");
        }

        @Override
        public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
                throws Exception {
            System.out.println("postHandle");

        }

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
                throws Exception {
            System.out.println("preHandle");
//            HttpSession session = request.getSession();
//            String user = (String)session.getAttribute("user");
//            if (user == null) {
//                response.setContentType("application/json;charset=utf-8");
//                Result result = new Result();
//                result.setCode(Constant.USER_NOT_LOGIN_CODE);
//                result.setMessage(Constant.USER_NOT_LOGIN_MSG);
//                response.getWriter().write(JSONObject.toJSONString(result));
//                logger.info("无权限！请先登录！！");
//                return false;
//            } else {
//                logger.info("有权限！放行");
//                // TODO 验证逻辑
//                return true;
//            }
            return true;
        }

    }
}
