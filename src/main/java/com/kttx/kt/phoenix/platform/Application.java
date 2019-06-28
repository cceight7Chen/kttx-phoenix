package com.kttx.kt.phoenix.platform;

import com.kttx.kt.phoenix.platform.utils.interceptor.PhoenixPlatformInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 增加拦截器，指定拦截器类，指定该类拦截的url
     */
    @Configuration
    static class WebMvcConfigurer extends WebMvcConfigurerAdapter {

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            //注册自定义拦截器，添加拦截路径和排除拦截路径
            registry.addInterceptor(new PhoenixPlatformInterceptor()).addPathPatterns("/KTP**").addPathPatterns("/Test**");
            //.excludePathPatterns("/admin/login.do").excludePathPatterns("/admin");
        }
    }


}
