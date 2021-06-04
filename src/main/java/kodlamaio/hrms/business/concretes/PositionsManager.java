package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.dataAccess.abstracts.PositionsDao;
import kodlamaio.hrms.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionsManager implements PositionsService {
    private PositionsDao positionsDao;
    @Autowired
    public PositionsManager(PositionsDao positionsDao){
        super();
        this.positionsDao = positionsDao;
    }


    @Override
    public List<Positions> getAll() {
        return this.positionsDao.findAll(); //hepsini bulmak için
    }
}
