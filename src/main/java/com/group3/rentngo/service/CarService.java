package com.group3.rentngo.service;

import com.group3.rentngo.model.dto.CarDto;
import com.group3.rentngo.model.entity.Car;
import com.group3.rentngo.model.entity.CarImage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> listCarOfOwner(Long id);

    Optional<Car> findbyId(Long id);

    void addCar(CarDto carDto, CarImage carImage);

    void addCarImage(CarImage carImage );


    public String storeFile(String saveLocation, MultipartFile file);
}
