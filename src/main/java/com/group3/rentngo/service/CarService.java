package com.group3.rentngo.service;

import com.group3.rentngo.model.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
     List<Car> listCarOfOwner(Long id);
     Optional<Car> findbyId(Long id);
}
