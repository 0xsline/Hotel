package com.project.demo.config;

import com.project.demo.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 */
@Configuration
@Slf4j
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截的管理器
        InterceptorRegistration registration = registry.addInterceptor(loginInterceptor());
        //拦截的地址
        registration.addPathPatterns("/**");

        // 下面是放行的地址，不登录也可以进行请求
        // 酒店菜品
        registration.excludePathPatterns("/api/hotel_dishes/get_list");
        // 酒店酒水
        registration.excludePathPatterns("/api/hotel_drinks/get_list");
        // 酒店房间
        registration.excludePathPatterns("/api/hotel_room/get_list");
        // 酒店餐桌
        registration.excludePathPatterns("/api/hotel_table/get_list");
        // 请求图片
        registration.excludePathPatterns("/api/upload/**");

        registration.excludePathPatterns("/api/link/get_list");
        // 广告
        registration.excludePathPatterns("/api/ad/get_list");
        //根据需要拦截，一般设置所有地址拦截，放行公共连接
    }

    @Bean
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

}
