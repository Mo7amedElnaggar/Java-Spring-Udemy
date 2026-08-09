package org.naggar;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements ComputerInterface {

    public Desktop() {
        System.out.println("Desktop Object Created...");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}
