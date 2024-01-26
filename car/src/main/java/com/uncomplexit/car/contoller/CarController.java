package com.uncomplexit.car.contoller;

import com.uncomplexit.car.beans.Car;
import com.uncomplexit.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/")
    public List<Car> getCars(){
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Integer id) {
        return carService.getCarId(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody Car car) {
        return carService.insertCar(car);
    }
}
