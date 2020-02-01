package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;


    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, Skill someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = (List<Skill>) someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkills() {
        return (Skill) skills;
    }

    public void setSkills(Skill skills) {
        this.skills = (List<Skill>) skills;
    }

}
