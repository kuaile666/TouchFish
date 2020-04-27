package com.codeduck;

import com.codeduck.filter.MyFilter;
import com.codeduck.filter.AZFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/27
 */
@SpringBootApplication
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean1() {
        FilterRegistrationBean filterRegistrationBean1 = new FilterRegistrationBean(new AZFilter());
        filterRegistrationBean1.addUrlPatterns("/*");
        filterRegistrationBean1.setOrder(2);
        return filterRegistrationBean1;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean filterRegistrationBean2 = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean2.addUrlPatterns("/*");
        //指定过滤器优先顺序,值越小越优先
        filterRegistrationBean2.setOrder(1);
        return filterRegistrationBean2;
    }
}
