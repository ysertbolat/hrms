package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    DataResult<List<Position>> getAll();
    Result add(Position position);
}
