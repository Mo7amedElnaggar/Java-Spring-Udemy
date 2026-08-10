package org.naggar.section10movingspringboot.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements ComputerInteface {
    @Override
    public void compile() {
        System.out.println("Compiling on a desktop...");
    }
}
