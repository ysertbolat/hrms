package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EducationsService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Educations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {
    private final EducationsService educationsService;

    @Autowired
    public EducationsController(EducationsService educationsService) {
        this.educationsService = educationsService;
    }

    @GetMapping("/getEducations")
    public DataResult<List<Educations>> getEducations() {
        return this.educationsService.getAllEducations();
    }

    @PostMapping("/addEducation")
    public Result addEducation(@RequestBody Educations educations) {
        return this.educationsService.addEducation(educations);
    }
}
