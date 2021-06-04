package kodlamaio.hrms.core.helpers;

import kodlamaio.hrms.core.utilities.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {

    DataResult<Map> addPicture(MultipartFile file) throws IOException;
}
