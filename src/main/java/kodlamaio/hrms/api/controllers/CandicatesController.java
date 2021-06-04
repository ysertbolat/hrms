package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandicatesService;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candicates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candicates")
public class CandicatesController {
    private CandicatesService candicatesService;

    @Autowired
    public CandicatesController(CandicatesService candicatesService){
        this.candicatesService = candicatesService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candicates>> getAll(){
        return this.candicatesService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candicates candicates){
        return this.candicatesService.add(candicates);
    }
}
