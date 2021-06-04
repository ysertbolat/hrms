package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {
    private PositionDao positionDao;
    @Autowired
    public PositionManager(PositionDao positionDao){
        super();
        this.positionDao = positionDao;
    }

    @Override
    public DataResult<List<Position>> getAll() {
        return new SuccessDataResult<>
                (positionDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Position position) {
        if (position.getPositionName()!=null){
            return new ErrorResult("Job position already exists");
        }
        else if ((position.getPositionName().trim()).equals("")){
            return new ErrorResult("Null value cannot be defined");
        }
        this.positionDao.save(position);
        return new SuccessResult("Added");
    }
}
