package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SocialMediasService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediasDao;
import kodlamaio.hrms.entities.concretes.SocialMedias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediasManager implements SocialMediasService {

    private final SocialMediasDao socialMediasDao;

    @Autowired
    public SocialMediasManager(SocialMediasDao socialMediasDao) {
        this.socialMediasDao = socialMediasDao;
    }

    @Override
    public Result addSocialMedia(SocialMedias socialMedias) {
        this.socialMediasDao.save(socialMedias);
        return new SuccessResult("Success: Sosyal medya bağlantıları başarıyla sisteme eklendi!");
    }
}
