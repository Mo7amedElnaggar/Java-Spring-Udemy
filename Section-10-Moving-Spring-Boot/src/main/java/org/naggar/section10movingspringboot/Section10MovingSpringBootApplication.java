package org.naggar.section10movingspringboot;

import org.naggar.section10movingspringboot.model.Alien;
import org.naggar.section10movingspringboot.model.Laptop;
import org.naggar.section10movingspringboot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section10MovingSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Section10MovingSpringBootApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.compile();

        LaptopService laptopService = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        laptopService.addLaptop(laptop);
    }
}
