package ru.vtb.task5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.vtb.task5.controllers.ProductRegisterController;
import ru.vtb.task5.repository.AccountPoolRepo;
import ru.vtb.task5.repository.AccountRepo;

@SpringBootApplication(scanBasePackages = "ru.vtb.task5")
public class Main {
    @Autowired
    AccountPoolRepo accountPoolRepo;
    @Autowired
    AccountRepo accountRepo;

    public static void main(String[] args) {

        var context = SpringApplication.run(Main.class,args);
        context.getBean(ProductRegisterController.class);
                //.make();
    }
}
