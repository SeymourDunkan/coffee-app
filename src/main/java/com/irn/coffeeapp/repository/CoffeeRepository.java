package com.irn.coffeeapp.repository;

import com.irn.coffeeapp.model.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
