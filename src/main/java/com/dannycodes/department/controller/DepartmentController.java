package com.dannycodes.department.controller;

import com.dannycodes.department.entities.Department;
import com.dannycodes.department.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
     private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
      log.info("inside saveDepartment method of Departmentcontroller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById method of Departmentcontroller");
        return departmentService.findDepartmentById(departmentId);
    }


}
