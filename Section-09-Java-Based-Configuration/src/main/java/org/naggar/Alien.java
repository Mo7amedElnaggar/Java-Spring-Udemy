package org.naggar;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    private ComputerInterface compputerInterface;

    public Alien(@Value("22") int age, ComputerInterface compputerInterface) {
        this.age = age;
        this.compputerInterface = compputerInterface;
    }

    public void code() {
        System.out.println("Alien Coding...");
        compputerInterface.compile();
    }
}
