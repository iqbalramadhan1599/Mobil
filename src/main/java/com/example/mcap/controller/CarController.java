package com.example.mcap.controller;


import com.example.mcap.entity.CarEntity;
import com.example.mcap.repository.CarRepository;
import com.example.mcap.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "car")
public class CarController {

    @Autowired
    CarRepository carRepository;


    @Autowired
    CarService carService;

    @GetMapping(value = "all")
    public List<CarEntity> getAllCar()
    {
        return carRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public CarEntity getById(@PathVariable Long id)
    {
        return carRepository.findById(id).get();
    }

    @DeleteMapping(value = "delete")
    public void deleteById(@RequestParam Long id)
    {
        carService.deleteById(id);
    }

    @PostMapping(value = "insert")
    public void insert(@Valid @RequestBody CarEntity carEntity)
    {
        carService.insert(carEntity);

    }

    @PutMapping(value = "update")
    public void update(@RequestBody CarEntity carEntity)
    {
        carService.update(carEntity);

    }

}
