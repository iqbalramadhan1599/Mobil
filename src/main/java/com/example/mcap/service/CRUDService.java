package com.example.mcap.service;

import com.example.mcap.entity.CarEntity;

public interface CRUDService<T, T1> {
    void insert(CarEntity carEntity);

    void deleteById(Long id);

    void update(CarEntity carEntity);

    CarEntity getById(Long id);
}
