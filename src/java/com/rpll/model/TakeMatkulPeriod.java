package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA



/**
 * TakeMatkulPeriod generated by hbm2java
 */
public class TakeMatkulPeriod  implements java.io.Serializable {


     private TakeMatkulPeriodId id;
     private Matkul matkul;
     private Students students;
     private Periods periods;
     private String matkulCef;

    public TakeMatkulPeriod() {
    }

	
    public TakeMatkulPeriod(TakeMatkulPeriodId id, Matkul matkul, Students students, Periods periods) {
        this.id = id;
        this.matkul = matkul;
        this.students = students;
        this.periods = periods;
    }
    public TakeMatkulPeriod(TakeMatkulPeriodId id, Matkul matkul, Students students, Periods periods, String matkulCef) {
       this.id = id;
       this.matkul = matkul;
       this.students = students;
       this.periods = periods;
       this.matkulCef = matkulCef;
    }
   
    public TakeMatkulPeriodId getId() {
        return this.id;
    }
    
    public void setId(TakeMatkulPeriodId id) {
        this.id = id;
    }
    public Matkul getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }
    public Students getStudents() {
        return this.students;
    }
    
    public void setStudents(Students students) {
        this.students = students;
    }
    public Periods getPeriods() {
        return this.periods;
    }
    
    public void setPeriods(Periods periods) {
        this.periods = periods;
    }
    public String getMatkulCef() {
        return this.matkulCef;
    }
    
    public void setMatkulCef(String matkulCef) {
        this.matkulCef = matkulCef;
    }




}


