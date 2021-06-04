package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobAdvertsService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAdverts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {
    private final JobAdvertsService jobAdvertsService;

    @Autowired
    public JobAdvertsController(JobAdvertsService jobAdvertsService) {
        this.jobAdvertsService = jobAdvertsService;
    }

    @GetMapping("/getJobAdverts")
    public DataResult<List<JobAdverts>> getJobAdverts() {
        return this.jobAdvertsService.getJobAdverts();
    }

    @GetMapping("/getActiveJobAdverts")
    public DataResult<List<JobAdverts>> getActiveJobAdverts() {
        return this.jobAdvertsService.getActiveJobAdverts();
    }

    @GetMapping("/getJobAdvertsForCompanyName")
    public DataResult<List<JobAdverts>> getActiveJobAdvertsForEmployer(String companyName) {
        return this.jobAdvertsService.getActiveJobAdvertsForEmployer(companyName);
    }

    @GetMapping("/getActiveJobAdvertsSorted")
    public DataResult<List<JobAdverts>> findAllByIsActiveTrueSorted() {
        return this.jobAdvertsService.findAllByIsActiveTrue();
    }

    @PostMapping("/addJobadvert")
    public Result addJobAdverts(@RequestBody JobAdverts jobAdverts) {
        return this.jobAdvertsService.addJobAdvert(jobAdverts);
    }
}