package org.naggar.section10movingspringboot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements ComputerInteface {
    @Override
    public void compile() {
        System.out.println("Compiling on a laptop...");
    }
}
