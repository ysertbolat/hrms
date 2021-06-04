package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SocialMediasService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SocialMedias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/socialmedias")
public class SocialMediasController {

    private final SocialMediasService socialMediasService;

    @Autowired
    public SocialMediasController(SocialMediasService socialMediasService) {
        this.socialMediasService = socialMediasService;
    }

    @PostMapping("/addSocialMedia")
    public Result addSocialMedia(@RequestBody SocialMedias socialMedias) {
        return this.socialMediasService.addSocialMedia(socialMedias);
    }
}
