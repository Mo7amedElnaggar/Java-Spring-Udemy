package org.naggar.section10movingspringboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("30")
    private int age;
    private ComputerInteface computerInteface;

    public Alien(@Value("30") int age, ComputerInteface computerInteface) {
        this.age = age;
        this.computerInteface = computerInteface;
    }

    public void compile() {
        computerInteface.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ComputerInteface getComputerInteface() {
        return computerInteface;
    }

    public void setComputerInteface(ComputerInteface computerInteface) {
        this.computerInteface = computerInteface;
    }
}
