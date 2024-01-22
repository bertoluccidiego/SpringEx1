package org.example.main;

import org.example.config.ProjectConfig;
import org.example.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        String hello = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);

        System.out.println(parrot.getName());
        System.out.println(hello);
        System.out.println(ten);
    }
}