package org.naggar.section10movingspringboot.service;

import org.naggar.section10movingspringboot.repo.LaptopRepository;
import org.naggar.section10movingspringboot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
