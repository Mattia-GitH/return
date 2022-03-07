package com.example.demo.dto;


import com.example.demo.entity.OrdersEntity;
import com.example.demo.model.OrdersModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrdersDto {

    public OrdersModel toModel(OrdersEntity entity){
        OrdersModel model = new OrdersModel();
        model.setId(entity.getId());
        model.setImei(entity.getImei());
        model.setDate(entity.getDate());
        model.setNote(entity.getNote());
        model.setOperator(entity.getOperator());
        model.setVerified(entity.isVerified());
        return model;
    }

    public List<OrdersModel> listToModels(List<OrdersEntity> entityList){
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public OrdersEntity toEntity(OrdersModel model){
        OrdersEntity entity = new OrdersEntity();
        entity.setId(model.getId());
        entity.setImei(model.getImei());
        entity.setDate(model.getDate());
        entity.setNote(model.getNote());
        entity.setOperator(model.getOperator());
        entity.setVerified(model.isVerified());
        return entity;
    }

    public List<OrdersEntity> listToEntities(List<OrdersModel> modelsList){
        return modelsList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
