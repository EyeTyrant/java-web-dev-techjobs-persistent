package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

  @NotBlank(message = "Must enter a location")
  private String location;

  @OneToMany
  @JoinColumn(name = "employer_id")
  private final List<Job> jobs = new ArrayList<>();

  public Employer() {
  }

  public Employer(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<Job> getJobs() {
    return jobs;
  }

//  public void setJobs(List<Job> jobs) {
//    this.jobs = jobs;
//  }

}
