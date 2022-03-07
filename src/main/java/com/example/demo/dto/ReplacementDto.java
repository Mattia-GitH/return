package com.example.demo.dto;

import com.example.demo.entity.ReplacementEntity;
import com.example.demo.model.ReplacementModel;
import org.springframework.stereotype.Component;

@Component
public class ReplacementDto {

    public ReplacementModel toModel(ReplacementEntity entity){}
}
