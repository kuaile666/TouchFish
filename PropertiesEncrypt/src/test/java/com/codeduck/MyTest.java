package com.codeduck;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Lin Liangkun
 * @Date: 2020/4/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunApplication.class)
public class MyTest {
    @Autowired
    private ApplicationContext appCtx;
    @Autowired
    private StringEncryptor encode;

    @Test
    public void testEncrypt() {
        Environment environment = appCtx.getBean(Environment.class);
        String password1 = environment.getProperty("password1");
        String encrypt = encode.encrypt(password1);
        System.out.println(encrypt);
    }
    @Test
    public void test() {
        Environment environment = appCtx.getBean(Environment.class);
        String password2 = environment.getProperty("password2");
        System.out.println(password2);
    }
}
