package ru.vtb.task5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.vtb.task5.repository.AccountPoolRepo;


@SpringBootApplication(scanBasePackages = "ru.vtb.task5")
@PropertySource("classpath:application.properties")
//@EnableJpaRepositories("ru.vtb.task5.repository")
public class Main {

    public static void main(String[] args) {

        var context = SpringApplication.run(Main.class,args);
        System.out.println(context.getBean(AccountPoolRepo.class));

    }
}
