package com.shankar.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        String config_file_loc = "src/test/resources/config.properties";
        try (org.springframework.context.ConfigurableApplicationContext context =
                     new ClassPathXmlApplicationContext(config_file_loc)) {

            System.out.println("================");
            student sid1 = (student) context.getBean("std1001");
            sid1.studentinfo();

        }
    }
    
}
