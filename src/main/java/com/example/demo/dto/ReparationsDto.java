package com.example.demo.dto;

import com.example.demo.entity.ReparationsEntity;
import com.example.demo.model.ReparationsModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReparationsDto {

    public ReparationsModel toModel(ReparationsEntity entity){
        ReparationsModel model = new ReparationsModel();
        model.setImei(entity.getImei());
        model.setState(entity.getState());
        model.setOld_component(entity.getOld_component());
        model.setNew_component(entity.getNew_component());
        return model;
    }

    public List<ReparationsModel> listToModels(List<ReparationsEntity> entityList){
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public ReparationsEntity toEntity(ReparationsModel model){
        ReparationsEntity entity = new ReparationsEntity();
        entity.setImei(model.getImei());
        entity.setState(model.getState());
        entity.setOld_component(model.getOld_component());
        entity.setNew_component(model.getNew_component());
        return entity;
    }

    public List<ReparationsEntity> listToEntities(List<ReparationsModel> modelsList){
        return modelsList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
