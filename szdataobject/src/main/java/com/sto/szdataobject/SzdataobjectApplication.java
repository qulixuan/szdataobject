package com.sto.szdataobject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sto.szdataobject.dao")
public class SzdataobjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzdataobjectApplication.class, args);
    }

}
