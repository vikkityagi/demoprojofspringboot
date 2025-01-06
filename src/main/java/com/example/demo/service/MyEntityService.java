package com.example.demo.service;

import com.example.demo.entity.MyEntity;
import com.example.demo.repo.MyEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyEntityService {

    @Autowired
    private MyEntityRepository repository;

    public List<MyEntity> getAllEntities() {
        return repository.findAll();
    }

    public Optional<MyEntity> getEntityById(Long id) {
        return repository.findById(id);
    }

    public MyEntity saveEntity(MyEntity entity) {
        return repository.save(entity);
    }

    public void deleteEntity(Long id) {
        repository.deleteById(id);
    }
}

