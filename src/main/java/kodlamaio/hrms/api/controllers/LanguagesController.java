package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.LanguagesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private final LanguagesService languagesService;

    @Autowired
    public LanguagesController(LanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping("/getLanguages")
    public DataResult<List<Languages>> getLanguages() {
        return this.languagesService.getLanguages();
    }

    @PostMapping("/addLanguages")
    public DataResult<List<Languages>> addLanguages(@RequestBody List<Languages> languages) {
        return this.languagesService.addLanguages(languages);
    }
}
