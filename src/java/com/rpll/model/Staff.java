package com.rpll.model;
// Generated Apr 15, 2013 2:00:19 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private Integer staffId;
     private Jobs jobs;
     private University university;
     private String staffName;
     private String staffAddress;
     private String staffTelp;
     private String staffPass;
     private Set<Announcements> announcementses = new HashSet<Announcements>(0);

    public Staff() {
    }

	
    public Staff(Jobs jobs, University university, String staffName, String staffAddress, String staffTelp, String staffPass) {
        this.jobs = jobs;
        this.university = university;
        this.staffName = staffName;
        this.staffAddress = staffAddress;
        this.staffTelp = staffTelp;
        this.staffPass = staffPass;
    }
    public Staff(Jobs jobs, University university, String staffName, String staffAddress, String staffTelp, String staffPass, Set<Announcements> announcementses) {
       this.jobs = jobs;
       this.university = university;
       this.staffName = staffName;
       this.staffAddress = staffAddress;
       this.staffTelp = staffTelp;
       this.staffPass = staffPass;
       this.announcementses = announcementses;
    }
   
    public Integer getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
    public Jobs getJobs() {
        return this.jobs;
    }
    
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
    public University getUniversity() {
        return this.university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }
    public String getStaffName() {
        return this.staffName;
    }
    
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getStaffAddress() {
        return this.staffAddress;
    }
    
    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }
    public String getStaffTelp() {
        return this.staffTelp;
    }
    
    public void setStaffTelp(String staffTelp) {
        this.staffTelp = staffTelp;
    }
    public String getStaffPass() {
        return this.staffPass;
    }
    
    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass;
    }
    public Set<Announcements> getAnnouncementses() {
        return this.announcementses;
    }
    
    public void setAnnouncementses(Set<Announcements> announcementses) {
        this.announcementses = announcementses;
    }




}


