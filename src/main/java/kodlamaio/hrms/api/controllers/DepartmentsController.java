package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.DepartmentsService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {

    private final DepartmentsService departmentsService;

    @Autowired
    public DepartmentsController(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }

    @GetMapping("/getDepartments")
    public DataResult<List<Departments>> getDepartments() {
        return this.departmentsService.getAllDepartment();
    }

    @PostMapping("/addDepartment")
    public Result addDepartment(@RequestBody Departments departments) {
        return this.departmentsService.addDepartment(departments);
    }
}
