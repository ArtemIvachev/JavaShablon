package com.example.prac10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class Prac10Application {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(BeanClass.class);


        Programmer programmer = app.getBean(Junior.class);
        programmer.doCoding();

        programmer = app.getBean(Middle.class);
        programmer.doCoding();

        programmer = app.getBean(Senior.class);
        programmer.doCoding();
    }
}
