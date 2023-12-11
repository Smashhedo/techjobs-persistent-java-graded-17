package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    //No-arg constructor
    public Skill() {}

    //Empty event object
    //model.addAttribute(new Skill());

    @ManyToMany(mappedBy = "skills")
    private String jobs;

    @NotBlank(message = "Description is required")
    @Size(max = 500, message = "Description too long!")
    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
}
