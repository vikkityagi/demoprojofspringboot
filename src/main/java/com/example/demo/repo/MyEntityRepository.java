package com.example.demo.repo;

import com.example.demo.entity.MyEntity;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
