package com.rpll.model;
// Generated Apr 12, 2013 9:26:29 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Lectures generated by hbm2java
 */
public class Lectures  implements java.io.Serializable {


     private Integer lectureId;
     private String lectureName;
     private String lectureAddress;
     private String lectureTelp;
     private String lectureEmail;
     private Set<LecturesWork> lecturesWorks = new HashSet<LecturesWork>(0);
     private Set<LecturesEdu> lecturesEdus = new HashSet<LecturesEdu>(0);
     private Set<Students> studentses = new HashSet<Students>(0);
     private Set<TeachPeriod> teachPeriods = new HashSet<TeachPeriod>(0);
     private Set<TakeRooms> takeRoomses = new HashSet<TakeRooms>(0);
     private Set<ClassSession> classSessions = new HashSet<ClassSession>(0);
     private Set<Bobot> bobots = new HashSet<Bobot>(0);
     private Set<Department> departments = new HashSet<Department>(0);

    public Lectures() {
    }

	
    public Lectures(String lectureName, String lectureAddress, String lectureTelp, String lectureEmail) {
        this.lectureName = lectureName;
        this.lectureAddress = lectureAddress;
        this.lectureTelp = lectureTelp;
        this.lectureEmail = lectureEmail;
    }
    public Lectures(String lectureName, String lectureAddress, String lectureTelp, String lectureEmail, Set<LecturesWork> lecturesWorks, Set<LecturesEdu> lecturesEdus, Set<Students> studentses, Set<TeachPeriod> teachPeriods, Set<TakeRooms> takeRoomses, Set<ClassSession> classSessions, Set<Bobot> bobots, Set<Department> departments) {
       this.lectureName = lectureName;
       this.lectureAddress = lectureAddress;
       this.lectureTelp = lectureTelp;
       this.lectureEmail = lectureEmail;
       this.lecturesWorks = lecturesWorks;
       this.lecturesEdus = lecturesEdus;
       this.studentses = studentses;
       this.teachPeriods = teachPeriods;
       this.takeRoomses = takeRoomses;
       this.classSessions = classSessions;
       this.bobots = bobots;
       this.departments = departments;
    }
   
    public Integer getLectureId() {
        return this.lectureId;
    }
    
    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }
    public String getLectureName() {
        return this.lectureName;
    }
    
    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
    public String getLectureAddress() {
        return this.lectureAddress;
    }
    
    public void setLectureAddress(String lectureAddress) {
        this.lectureAddress = lectureAddress;
    }
    public String getLectureTelp() {
        return this.lectureTelp;
    }
    
    public void setLectureTelp(String lectureTelp) {
        this.lectureTelp = lectureTelp;
    }
    public String getLectureEmail() {
        return this.lectureEmail;
    }
    
    public void setLectureEmail(String lectureEmail) {
        this.lectureEmail = lectureEmail;
    }
    public Set<LecturesWork> getLecturesWorks() {
        return this.lecturesWorks;
    }
    
    public void setLecturesWorks(Set<LecturesWork> lecturesWorks) {
        this.lecturesWorks = lecturesWorks;
    }
    public Set<LecturesEdu> getLecturesEdus() {
        return this.lecturesEdus;
    }
    
    public void setLecturesEdus(Set<LecturesEdu> lecturesEdus) {
        this.lecturesEdus = lecturesEdus;
    }
    public Set<Students> getStudentses() {
        return this.studentses;
    }
    
    public void setStudentses(Set<Students> studentses) {
        this.studentses = studentses;
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
    public Set<Department> getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }




}


