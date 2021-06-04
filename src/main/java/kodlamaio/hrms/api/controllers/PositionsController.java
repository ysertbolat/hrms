package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {

    private PositionsService positionsService;

    @Autowired
    public PositionsController(PositionsService positionsService){
        super();
        this.positionsService = positionsService;
    }

    public PositionsController(){

    }

    @GetMapping("/getAll")
    public List<Positions> getAll(){
        return this.positionsService.getAll();
    }
}
