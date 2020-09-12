package com.example.angular.springbootangularkubernetes.repository;

import com.example.angular.springbootangularkubernetes.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
