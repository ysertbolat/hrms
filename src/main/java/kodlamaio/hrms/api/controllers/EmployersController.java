package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    private EmployersService employerService;

    @Autowired
    public EmployersController(EmployersService employerService){
        this.employerService=employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employers>> getAll(){
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employers employers){

        return this.employerService.add(employers);
    }
}
