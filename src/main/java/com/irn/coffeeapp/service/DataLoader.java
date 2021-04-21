package com.irn.coffeeapp.service;

import com.irn.coffeeapp.model.Coffee;
import com.irn.coffeeapp.repository.CoffeeRepository;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {
    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        coffeeRepository.saveAll(List.of(
                new Coffee("CAFFÈ CAPPUCCINO"),
                new Coffee("CAFFÈ LATTE"),
                new Coffee("CAFFÈ MOCHA"),
                new Coffee("CAFFÈ AMERICANO")
        ));
    }

}
