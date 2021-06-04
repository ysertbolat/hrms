package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Positions;

import java.util.List;

public interface PositionsService {
    List<Positions> getAll();
}
