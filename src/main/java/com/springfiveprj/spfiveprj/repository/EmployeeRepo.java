package com.springfiveprj.spfiveprj.repository;

import com.springfiveprj.spfiveprj.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepo extends ReactiveMongoRepository<Employee,String> {
}
