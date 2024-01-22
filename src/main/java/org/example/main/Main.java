package org.example.main;

import org.example.config.ProjectConfig;
import org.example.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        context.registerBean("parrot", Parrot.class, () -> x);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(parrot.getName());
    }
}