package com.rpll.model;
// Generated Apr 12, 2013 9:26:29 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Matkul generated by hbm2java
 */
public class Matkul  implements java.io.Serializable {


     private Integer matkulId;
     private MatkulType matkulType;
     private String matkulName;
     private int bobotSks;
     private Set<Marks> markses = new HashSet<Marks>(0);
     private Set<TeachPeriod> teachPeriods = new HashSet<TeachPeriod>(0);
     private Set<TakeRooms> takeRoomses = new HashSet<TakeRooms>(0);
     private Set<Department> departments = new HashSet<Department>(0);
     private Set<TakeMatkulPeriod> takeMatkulPeriods = new HashSet<TakeMatkulPeriod>(0);
     private Set<ClassSession> classSessions = new HashSet<ClassSession>(0);
     private Set<Bobot> bobots = new HashSet<Bobot>(0);
     private Set<Modul> moduls = new HashSet<Modul>(0);
     private Set<Absences> absenceses = new HashSet<Absences>(0);

    public Matkul() {
    }

	
    public Matkul(MatkulType matkulType, String matkulName, int bobotSks) {
        this.matkulType = matkulType;
        this.matkulName = matkulName;
        this.bobotSks = bobotSks;
    }
    public Matkul(MatkulType matkulType, String matkulName, int bobotSks, Set<Marks> markses, Set<TeachPeriod> teachPeriods, Set<TakeRooms> takeRoomses, Set<Department> departments, Set<TakeMatkulPeriod> takeMatkulPeriods, Set<ClassSession> classSessions, Set<Bobot> bobots, Set<Modul> moduls, Set<Absences> absenceses) {
       this.matkulType = matkulType;
       this.matkulName = matkulName;
       this.bobotSks = bobotSks;
       this.markses = markses;
       this.teachPeriods = teachPeriods;
       this.takeRoomses = takeRoomses;
       this.departments = departments;
       this.takeMatkulPeriods = takeMatkulPeriods;
       this.classSessions = classSessions;
       this.bobots = bobots;
       this.moduls = moduls;
       this.absenceses = absenceses;
    }
   
    public Integer getMatkulId() {
        return this.matkulId;
    }
    
    public void setMatkulId(Integer matkulId) {
        this.matkulId = matkulId;
    }
    public MatkulType getMatkulType() {
        return this.matkulType;
    }
    
    public void setMatkulType(MatkulType matkulType) {
        this.matkulType = matkulType;
    }
    public String getMatkulName() {
        return this.matkulName;
    }
    
    public void setMatkulName(String matkulName) {
        this.matkulName = matkulName;
    }
    public int getBobotSks() {
        return this.bobotSks;
    }
    
    public void setBobotSks(int bobotSks) {
        this.bobotSks = bobotSks;
    }
    public Set<Marks> getMarkses() {
        return this.markses;
    }
    
    public void setMarkses(Set<Marks> markses) {
        this.markses = markses;
    }
    public Set<TeachPeriod> getTeachPeriods() {
        return this.teachPeriods;
    }
    
    public void setTeachPeriods(Set<TeachPeriod> teachPeriods) {
        this.teachPeriods = teachPeriods;
    }
    public Set<TakeRooms> getTakeRoomses() {
        return this.takeRoomses;
    }
    
    public void setTakeRoomses(Set<TakeRooms> takeRoomses) {
        this.takeRoomses = takeRoomses;
    }
    public Set<Department> getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
    public Set<TakeMatkulPeriod> getTakeMatkulPeriods() {
        return this.takeMatkulPeriods;
    }
    
    public void setTakeMatkulPeriods(Set<TakeMatkulPeriod> takeMatkulPeriods) {
        this.takeMatkulPeriods = takeMatkulPeriods;
    }
    public Set<ClassSession> getClassSessions() {
        return this.classSessions;
    }
    
    public void setClassSessions(Set<ClassSession> classSessions) {
        this.classSessions = classSessions;
    }
    public Set<Bobot> getBobots() {
        return this.bobots;
    }
    
    public void setBobots(Set<Bobot> bobots) {
        this.bobots = bobots;
    }
    public Set<Modul> getModuls() {
        return this.moduls;
    }
    
    public void setModuls(Set<Modul> moduls) {
        this.moduls = moduls;
    }
    public Set<Absences> getAbsenceses() {
        return this.absenceses;
    }
    
    public void setAbsenceses(Set<Absences> absenceses) {
        this.absenceses = absenceses;
    }




}


