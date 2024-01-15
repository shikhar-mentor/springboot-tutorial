package com.uncomplexit.car.service;

import com.uncomplexit.car.beans.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();

    public Car getCarId(Integer id);

    public Car insertCar(Car c);
}
