package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobExperiencesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobExperiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobexperiences")
public class JobExperiencesController {

    private final JobExperiencesService jobExperiencesService;

    @Autowired
    public JobExperiencesController(JobExperiencesService jobExperiencesService) {
        this.jobExperiencesService = jobExperiencesService;
    }

    @PostMapping("/addJobExperience")
    public Result addJobExperience(@RequestBody JobExperiences jobExperiences) {
        return this.jobExperiencesService.addJobExperience(jobExperiences);
    }
}
