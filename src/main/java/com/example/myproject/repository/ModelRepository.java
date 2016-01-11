package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.domain.Model;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {

}
