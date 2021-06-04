package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionsService {
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
