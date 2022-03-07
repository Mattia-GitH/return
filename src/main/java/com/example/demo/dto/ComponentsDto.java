package com.example.demo.dto;

import com.example.demo.entity.ComponentsEntity;
import com.example.demo.model.ComponentsModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ComponentsDto {

    public ComponentsModel toModel(ComponentsEntity entity){
        ComponentsModel model = new ComponentsModel();
        model.setId(entity.getId());
        model.setComponent(entity.getComponent());
        model.setSupplier(entity.getSupplier());
        return model;
    }

    public List<ComponentsModel> listToModels(List<ComponentsEntity> entityList){
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public ComponentsEntity toEntity(ComponentsModel model){
        ComponentsEntity entity = new ComponentsEntity();
        entity.setId(model.getId());
        entity.setComponent(model.getComponent());
        entity.setSupplier(model.getSupplier());
        return entity;
    }

    public List<ComponentsEntity> listToEntities(List<ComponentsModel> modelsList){
        return modelsList.stream().map(this::toEntity).collect(Collectors.toList());
    }

}
