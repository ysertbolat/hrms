package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Departments;

import java.util.List;

public interface DepartmentsService {
    Result addDepartment(Departments departments);

    DataResult<List<Departments>> getAllDepartment();
}
