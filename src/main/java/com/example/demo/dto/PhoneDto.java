package com.example.demo.dto;

import com.example.demo.entity.PhoneEntity;
import com.example.demo.model.PhoneModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PhoneDto {

    public PhoneModel toModel(PhoneEntity entity){
        PhoneModel model = new PhoneModel();
        model.setImei(entity.getImei());
        model.setModel(entity.getModel());
        return model;
    }

    public List<PhoneModel> listToModels(List<PhoneEntity> entityList){
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public PhoneEntity toEntity(PhoneModel model){
        PhoneEntity entity = new PhoneEntity();
        entity.setImei(model.getImei());
        entity.setModel(model.getModel());
        return entity;
    }

    public List<PhoneEntity> listToEntity(List<PhoneModel> modelsList){
        return modelsList.stream().map(this::toEntity).collect(Collectors.toList());
    }

}
