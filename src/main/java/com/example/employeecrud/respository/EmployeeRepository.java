package com.example.employeecrud.respository;

import com.example.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
}
