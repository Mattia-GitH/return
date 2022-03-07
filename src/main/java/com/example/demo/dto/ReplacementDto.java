package com.example.demo.dto;

import com.example.demo.entity.ReplacementEntity;
import com.example.demo.model.PhoneModel;
import com.example.demo.model.ReplacementModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReplacementDto {

    public ReplacementModel toModel(ReplacementEntity entity){
        ReplacementModel model = new ReplacementModel();
        model.setOld_imei(entity.getOld_imei());
        model.setNew_imei(entity.getNew_imei());
        model.setNote(entity.getNote());
        return model;
    }

    public List<ReplacementModel> listToModels (List<ReplacementEntity> entityList){
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }


}
