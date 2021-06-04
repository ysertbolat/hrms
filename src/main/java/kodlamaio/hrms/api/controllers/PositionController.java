package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
    private PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        super();
        this.positionService = positionService;
    }

    @GetMapping("/getall")
    public DataResult<List<Position>> getAll(){
        return this.positionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Position position){
        return this.positionService.add(position);
    }
}
