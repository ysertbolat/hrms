package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.ProgrammingLanguagesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {

    private final ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }

    @GetMapping("/getProgrammingLanguages")
    public DataResult<List<ProgrammingLanguages>> getProgrammingLanguages() {
        return this.programmingLanguagesService.getAllProgrammingLanguage();
    }

    @PostMapping("/addProgrammingLanguage")
    public Result addProgrammingLanguage(@RequestBody ProgrammingLanguages pl) {
        return this.programmingLanguagesService.addProgrammingLanguage(pl);
    }
}
