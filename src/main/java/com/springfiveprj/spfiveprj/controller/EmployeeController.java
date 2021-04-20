package com.springfiveprj.spfiveprj.controller;

import com.springfiveprj.spfiveprj.model.Employee;
import com.springfiveprj.spfiveprj.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmp")  //1000 req/sec
    public Mono<Employee> saveEmployee(@RequestBody Employee employee){
        Mono<Employee> emp=employeeRepo.save(employee);
        return emp;
    }

    @GetMapping("/getemp")
    public Flux<Employee> getEmployees(){
        return employeeRepo.findAll();
    }
}
