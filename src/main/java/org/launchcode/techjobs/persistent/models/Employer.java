package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
        @Size(min=2, max=50, message= "Location must be between 2 and 50 characters long")
        @NotBlank(message = "Location is required")
        private String location;

        public Employer (){
        }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
