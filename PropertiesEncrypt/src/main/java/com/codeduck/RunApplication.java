package com.codeduck;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/25
 */
@SpringBootApplication
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
