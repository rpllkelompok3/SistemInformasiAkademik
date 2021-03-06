package com.rpll.model;
// Generated Apr 26, 2013 8:19:43 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Periods generated by hbm2java
 */
public class Periods  implements java.io.Serializable {


     private Integer periodYear;
     private String periodDescription;
     private Date startFrs;
     private Date startPrs;
     private Date startPayment1;
     private Date startPayment2;
     private Date finishFrs;
     private Date finishPrs;
     private Date finishPayment1;
     private Date finishPayment2;
     private Date startSemester;
     private Date finishSemester;
     private int status;
     private int year;
     private Set<TeachPeriod> teachPeriods = new HashSet<TeachPeriod>(0);
     private Set<Marks> markses = new HashSet<Marks>(0);
     private Set<TakeMatkulPeriod> takeMatkulPeriods = new HashSet<TakeMatkulPeriod>(0);
     private Set<ClassSession> classSessions = new HashSet<ClassSession>(0);
     private Set<Bobot> bobots = new HashSet<Bobot>(0);
     private Set<Absences> absenceses = new HashSet<Absences>(0);

    public Periods() {
    }

	
    public Periods(String periodDescription, Date startFrs, Date startPrs, Date startPayment1, Date startPayment2, Date finishFrs, Date finishPrs, Date finishPayment1, Date finishPayment2, Date startSemester, Date finishSemester, int status, int year) {
        this.periodDescription = periodDescription;
        this.startFrs = startFrs;
        this.startPrs = startPrs;
        this.startPayment1 = startPayment1;
        this.startPayment2 = startPayment2;
        this.finishFrs = finishFrs;
        this.finishPrs = finishPrs;
        this.finishPayment1 = finishPayment1;
        this.finishPayment2 = finishPayment2;
        this.startSemester = startSemester;
        this.finishSemester = finishSemester;
        this.status = status;
        this.year = year;
    }
    public Periods(String periodDescription, Date startFrs, Date startPrs, Date startPayment1, Date startPayment2, Date finishFrs, Date finishPrs, Date finishPayment1, Date finishPayment2, Date startSemester, Date finishSemester, int status, int year, Set<TeachPeriod> teachPeriods, Set<Marks> markses, Set<TakeMatkulPeriod> takeMatkulPeriods, Set<ClassSession> classSessions, Set<Bobot> bobots, Set<Absences> absenceses) {
       this.periodDescription = periodDescription;
       this.startFrs = startFrs;
       this.startPrs = startPrs;
       this.startPayment1 = startPayment1;
       this.startPayment2 = startPayment2;
       this.finishFrs = finishFrs;
       this.finishPrs = finishPrs;
       this.finishPayment1 = finishPayment1;
       this.finishPayment2 = finishPayment2;
       this.startSemester = startSemester;
       this.finishSemester = finishSemester;
       this.status = status;
       this.year = year;
       this.teachPeriods = teachPeriods;
       this.markses = markses;
       this.takeMatkulPeriods = takeMatkulPeriods;
       this.classSessions = classSessions;
       this.bobots = bobots;
       this.absenceses = absenceses;
    }
   
    public Integer getPeriodYear() {
        return this.periodYear;
    }
    
    public void setPeriodYear(Integer periodYear) {
        this.periodYear = periodYear;
    }
    public String getPeriodDescription() {
        return this.periodDescription;
    }
    
    public void setPeriodDescription(String periodDescription) {
        this.periodDescription = periodDescription;
    }
    public Date getStartFrs() {
        return this.startFrs;
    }
    
    public void setStartFrs(Date startFrs) {
        this.startFrs = startFrs;
    }
    public Date getStartPrs() {
        return this.startPrs;
    }
    
    public void setStartPrs(Date startPrs) {
        this.startPrs = startPrs;
    }
    public Date getStartPayment1() {
        return this.startPayment1;
    }
    
    public void setStartPayment1(Date startPayment1) {
        this.startPayment1 = startPayment1;
    }
    public Date getStartPayment2() {
        return this.startPayment2;
    }
    
    public void setStartPayment2(Date startPayment2) {
        this.startPayment2 = startPayment2;
    }
    public Date getFinishFrs() {
        return this.finishFrs;
    }
    
    public void setFinishFrs(Date finishFrs) {
        this.finishFrs = finishFrs;
    }
    public Date getFinishPrs() {
        return this.finishPrs;
    }
    
    public void setFinishPrs(Date finishPrs) {
        this.finishPrs = finishPrs;
    }
    public Date getFinishPayment1() {
        return this.finishPayment1;
    }
    
    public void setFinishPayment1(Date finishPayment1) {
        this.finishPayment1 = finishPayment1;
    }
    public Date getFinishPayment2() {
        return this.finishPayment2;
    }
    
    public void setFinishPayment2(Date finishPayment2) {
        this.finishPayment2 = finishPayment2;
    }
    public Date getStartSemester() {
        return this.startSemester;
    }
    
    public void setStartSemester(Date startSemester) {
        this.startSemester = startSemester;
    }
    public Date getFinishSemester() {
        return this.finishSemester;
    }
    
    public void setFinishSemester(Date finishSemester) {
        this.finishSemester = finishSemester;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    public Set<TeachPeriod> getTeachPeriods() {
        return this.teachPeriods;
    }
    
    public void setTeachPeriods(Set<TeachPeriod> teachPeriods) {
        this.teachPeriods = teachPeriods;
    }
    public Set<Marks> getMarkses() {
        return this.markses;
    }
    
    public void setMarkses(Set<Marks> markses) {
        this.markses = markses;
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
    public Set<Absences> getAbsenceses() {
        return this.absenceses;
    }
    
    public void setAbsenceses(Set<Absences> absenceses) {
        this.absenceses = absenceses;
    }




}


