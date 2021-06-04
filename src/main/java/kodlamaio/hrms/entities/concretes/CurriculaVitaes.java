package kodlamaio.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "curricula_vitaes")
public class CurriculaVitaes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "picture_url")
    private String pictureUrl;

    @ManyToOne()
    @JoinColumn(name = "social_media_id")
    private SocialMedias socialMedias;

    @ManyToOne()
    @JoinColumn(name = "jobseeker_id")
    private JobSeekers jobSeekers;

    @OneToMany(mappedBy = "curriculaVitae")
    private List<Educations> educations;

    @OneToMany(mappedBy = "curriculaVitae")
    private List<JobExperiences> jobExperiences;

    @OneToMany(mappedBy = "curriculaVitae")
    private List<JobSeekerLanguages> jobSeekerLanguages;

    @OneToMany(mappedBy = "curriculaVitae")
    private List<ProgrammingLanguages> programmingLanguages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public SocialMedias getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(SocialMedias socialMedias) {
        this.socialMedias = socialMedias;
    }

    public JobSeekers getJobSeekers() {
        return jobSeekers;
    }

    public void setJobSeekers(JobSeekers jobSeekers) {
        this.jobSeekers = jobSeekers;
    }

    public List<Educations> getEducations() {
        return educations;
    }

    public void setEducations(List<Educations> educations) {
        this.educations = educations;
    }

    public List<JobExperiences> getJobExperiences() {
        return jobExperiences;
    }

    public void setJobExperiences(List<JobExperiences> jobExperiences) {
        this.jobExperiences = jobExperiences;
    }

    public List<JobSeekerLanguages> getJobSeekerLanguages() {
        return jobSeekerLanguages;
    }

    public void setJobSeekerLanguages(List<JobSeekerLanguages> jobSeekerLanguages) {
        this.jobSeekerLanguages = jobSeekerLanguages;
    }

    public List<ProgrammingLanguages> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<ProgrammingLanguages> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

}