package com.codingshuttle.anujTutorial.tutorial.repositories;

import com.codingshuttle.anujTutorial.tutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
