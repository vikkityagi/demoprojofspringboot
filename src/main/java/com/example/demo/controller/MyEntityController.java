package com.example.demo.controller;

import com.example.demo.dto.MyEntityDto;
import com.example.demo.entity.MyEntity;
import com.example.demo.service.MyEntityService;

import jakarta.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MyEntityController {

    @Autowired
    private MyEntityService service;

    @GetMapping
    public List<MyEntity> getAllEntities() {
        return service.getAllEntities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyEntity> getEntityById(@PathVariable Long id) {
        Optional<MyEntity> entity = service.getEntityById(id);
        return entity.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/local_env")
    public MyEntity createEntity( @Valid @RequestBody MyEntityDto myEntityDto) {
        try{
            MyEntity mEntity = new MyEntity();
            mEntity.setName(myEntityDto.getName());
            mEntity.setDescription(myEntityDto.getDescription());
            mEntity.setEmail(myEntityDto.getEmail());
            return service.saveEntity(mEntity);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    // @PostMapping("/local_dev")
    // public MyEntity createEntity2( @Valid @RequestBody MyEntityDto entity) {
    //     try{
    //         MyEntity mEntity = new MyEntity();
    //         BeanUtils.copyProperties(entity, mEntity);
    //         return service.saveEntity(mEntity);
    //     }catch(Exception e){
    //         e.printStackTrace();
    //     }
    //     return null;
    // }

}

