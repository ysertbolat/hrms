package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionManager implements PositionService {
    private PositionDao positionDao;
    @Autowired
    public PositionManager(PositionDao positionDao){
        super();
        this.positionDao = positionDao;
    }


    @Override
    public List<Position> getAll() {
        return this.positionDao.findAll(); //hepsini bulmak için
    }
}
