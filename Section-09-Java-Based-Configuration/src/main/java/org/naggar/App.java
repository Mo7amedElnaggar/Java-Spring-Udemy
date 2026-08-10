package org.naggar;
import org.naggar.config.AppConfig;
import org.naggar.config.ComponentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ComputerInterface computer = (ComputerInterface) context.getBean("desktop");
        computer.compile();

        ComputerInterface computer2 =  context.getBean(Desktop.class);
        computer2.compile();

        Alien alien = context.getBean(Alien.class);
        alien.code();

        /// Component Scan
        ApplicationContext componentContext = new AnnotationConfigApplicationContext(ComponentConfig.class);
        Alien componentAlien = componentContext.getBean(Alien.class);
        componentAlien.code();

    }
}
