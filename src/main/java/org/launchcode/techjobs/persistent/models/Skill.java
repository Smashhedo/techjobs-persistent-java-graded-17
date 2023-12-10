package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    //No-arg constructor
    public Skill() {}
    @NotBlank(message = "Description is required")
    @Size(max = 500, message = "Description too long!")
    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
