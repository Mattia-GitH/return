package com.example.demo.repository;

import com.example.demo.entity.ReplacementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplacementRepository extends JpaRepository<ReplacementEntity, Long> {
}
