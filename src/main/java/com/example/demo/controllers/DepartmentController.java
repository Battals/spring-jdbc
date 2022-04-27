package com.example.demo.controllers;

import com.example.demo.models.Department;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.IRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DepartmentController {
    private final IRepository<Department> departmentRepository = new DepartmentRepository();

    @GetMapping("/departments")
    public String allDepartments(Model model){
        model.addAttribute("departments",departmentRepository.getAllEntities());
        return "departments";
    }

    @GetMapping("/department")
    public String department(@RequestParam("id"), int id, Model model){
        Department dep = departmentRepository.getSingleById(id);
        model.addAttribute("department", dep);
        return "department";
    }

    @GetMapping("/createDepartment")
    public String createDepartment(@RequestParam("id"), int id, @RequestParam("name") String name,
                                   @RequestParam("location")String location, Model model ){
        Department department = new Department(id, name, location);
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.create(department);
        List departments = departmentRepository
    }
}
