package com.uncomplexit.car.service;

import com.uncomplexit.car.beans.Car;
import com.uncomplexit.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements  CarService {

    @Autowired
    private CarRepository repo;

    @Override
    public List<Car> getAllCars() {
        return repo.findAll();
    }

    @Override
    public Car getCarId(Integer id) {
        Car c = repo.getReferenceById(id);
        return c;
    }

    @Override
    public Car insertCar(Car c) {
        repo.save(c);
        return c;
    }
}
