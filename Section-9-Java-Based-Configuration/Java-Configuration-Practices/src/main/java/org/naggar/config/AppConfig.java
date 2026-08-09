package org.naggar.config;
import org.naggar.Alien;
import org.naggar.ComputerInterface;
import org.naggar.Desktop;
import org.naggar.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(ComputerInterface computerInterface) {
        return new Alien(21, computerInterface);
    }

    @Bean(name = "desktop")
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    @Scope("prototype")
    public Laptop laptop() {
        return new Laptop();
    }
}
