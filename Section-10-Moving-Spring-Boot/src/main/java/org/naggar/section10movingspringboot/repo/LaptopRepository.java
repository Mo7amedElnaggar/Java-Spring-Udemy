package org.naggar.section10movingspringboot.repo;

import org.naggar.section10movingspringboot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Laptop Saved...");
    }
}
