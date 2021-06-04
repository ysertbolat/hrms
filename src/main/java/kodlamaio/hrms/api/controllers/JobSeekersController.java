package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

    private final JobSeekersService jobSeekersService;

    @Autowired
    public JobSeekersController(JobSeekersService jobSeekersService) {
        this.jobSeekersService = jobSeekersService;
    }

    @GetMapping("/getJobseekers")
    public DataResult<List<JobSeekers>> getJobSeekers() {
        return this.jobSeekersService.getJobSeekers();
    }

    @PostMapping("/addJobseeker")
    public Result addJobSeeker(@RequestBody JobSeekers jobSeekers) {
        return this.jobSeekersService.addJobSeeker(jobSeekers);
    }
}
