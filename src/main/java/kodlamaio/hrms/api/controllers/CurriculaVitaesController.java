package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CurriculaVitaesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculaVitaes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/cvs")
public class CurriculaVitaesController {

    private final CurriculaVitaesService curriculaVitaesService;

    public CurriculaVitaesController(CurriculaVitaesService curriculaVitaesService) {
        this.curriculaVitaesService = curriculaVitaesService;
    }

//    @GetMapping("/getJobseekersWithCv")
//    public DataResult<List<JobseekerWithCurriculaVitaeDto>> getJobseekerWithCv(@RequestParam int id) {
//        return this.curriculaVitaeService.getJobSeekerWithCurriculaVitae(id);
//    }

    @GetMapping("/getCvWithJobSeekerId")
    public DataResult<CurriculaVitaes> findCvByJobSeekerId(int jobseekerId) {
        return this.curriculaVitaesService.findByJobSeekerId(jobseekerId);
    }

    @PostMapping("/addCv")
    public Result addCv(@RequestBody CurriculaVitaes curriculaVitaes) {
        return this.curriculaVitaesService.addCv(curriculaVitaes);
    }

    @PostMapping("/addPicture")
    public Result addPicture(int cvId, MultipartFile file) throws IOException {
        return this.curriculaVitaesService.uploadPicture(cvId, file);
    }
}
