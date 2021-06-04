package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolsService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Schools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
    private final SchoolsService schoolsService;

    @Autowired
    public SchoolsController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

    @GetMapping("/getSchools")
    public DataResult<List<Schools>> getSchools() {
        return this.schoolsService.getAllSchool();
    }

    @PostMapping("/addSchool")
    public Result addJobSeeker(@RequestBody Schools schools) {
        return this.schoolsService.addSchool(schools);
    }
}
