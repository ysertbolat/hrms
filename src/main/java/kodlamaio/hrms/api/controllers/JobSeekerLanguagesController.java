package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobSeekerLanguagesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobseekerLanguages")
public class JobSeekerLanguagesController {
    private final JobSeekerLanguagesService jobSeekerLanguagesService;

    @Autowired
    public JobSeekerLanguagesController(JobSeekerLanguagesService jobSeekerLanguagesService) {
        this.jobSeekerLanguagesService = jobSeekerLanguagesService;
    }

    @PostMapping("/addJobseekerLanguages")
    public Result addJobseekerLanguage(@RequestBody JobSeekerLanguages jobSeekerLanguages) {
        return this.jobSeekerLanguagesService.addJobSeekerLanguage(jobSeekerLanguages);
    }
}