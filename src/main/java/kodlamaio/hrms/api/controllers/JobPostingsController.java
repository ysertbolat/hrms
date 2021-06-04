package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobPostings;
import kodlamaio.hrms.business.abstracts.JobPostingsService;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/jobPosting")
public class JobPostingsController {

    private JobPostingsService jobPostingsService;

    public JobPostingsController(JobPostingsService jobPostingsService){
        this.jobPostingsService = jobPostingsService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPostings>> getAll(){return this.jobPostingsService.getAll();}

    @GetMapping("/getByDateOfCreate")
    public DataResult<List<JobPostings>> getByDateOfCreate(@RequestParam Date dateOfCreate){
        return this.jobPostingsService.getByDateOfCreate(dateOfCreate);
    }

    @GetMapping("/getByCompanyId")
    public DataResult<List<JobPostings>> getByCompanyId(@RequestParam int companyId){
        return this.jobPostingsService.getByCompanyId(companyId);
    }

    @PutMapping("/close")
    public Result close(JobPostings jobPostings){
        return this.jobPostingsService.close(jobPostings);
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPostings jobPostings){
        return this.jobPostingsService.add(jobPostings);
    }
}
