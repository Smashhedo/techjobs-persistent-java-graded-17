package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    //No-arg constructor
    public Employer() {}

    //Empty event object
    //model.addAttribute(new Employer());

//    @OneToMany(mappedBy = "job")
//    @JoinColumn (name = "employerId")
//    private final ArrayList<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required")
    @Size(min = 1, max = 100, message = "Location must be between 1 and 100 characters")
    public String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
//    public ArrayList<Job> getJobs() {
//        return jobs;
//    }

}
