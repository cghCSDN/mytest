package com.itheima;


import org.springframework.boot.SpringApplication;


public class MySpringBootApplication {
    public static void main(String[] args) {
        //run方法参数是引导类的字节码对象
        SpringApplication.run(BootBean.class,args);
    }
}
