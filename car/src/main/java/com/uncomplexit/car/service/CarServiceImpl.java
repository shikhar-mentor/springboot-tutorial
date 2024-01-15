package com.uncomplexit.car.service;

import com.uncomplexit.car.beans.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements  CarService {

    public static List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getCarId(Integer id) {
        Car c = cars.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
        return c;
    }

    @Override
    public Car insertCar(Car c) {
        cars.add(c);
        return c;
    }
}
