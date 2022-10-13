package com.example.mcap.service;

import com.example.mcap.entity.CarEntity;
import com.example.mcap.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CarService implements CRUDService<CarEntity, Long>{

    @Autowired
    CarRepository carRepository;

    @Override
    public void insert(CarEntity carEntity)
    {
        carRepository.save(carEntity);
    }

    @Override
    public void deleteById(Long id)
    {
        carRepository.deleteById(id);
    }

    @Override
    public void update(CarEntity carEntity)
    {
        getById(carEntity.getId());
        carRepository.save(carEntity);

    }

    @Override
    public CarEntity getById(Long id)
    {
        if (!carRepository.findById(id).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return carRepository.findById(id).get();



    }


}
