package com.example.demo.repository;

import com.example.demo.entity.ComponentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentsRepository extends JpaRepository<ComponentsEntity, Long> {
}
