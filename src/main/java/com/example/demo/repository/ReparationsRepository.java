package com.example.demo.repository;

import com.example.demo.entity.ReparationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparationsRepository extends JpaRepository<ReparationsEntity, Long> {
}
