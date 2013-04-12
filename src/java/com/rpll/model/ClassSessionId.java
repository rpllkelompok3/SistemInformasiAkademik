package com.rpll.model;
// Generated Apr 12, 2013 9:26:29 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ClassSessionId generated by hbm2java
 */
public class ClassSessionId  implements java.io.Serializable {


     private int lectureId;
     private int matkulId;
     private int periodId;
     private Date date;
     private Date time;

    public ClassSessionId() {
    }

    public ClassSessionId(int lectureId, int matkulId, int periodId, Date date, Date time) {
       this.lectureId = lectureId;
       this.matkulId = matkulId;
       this.periodId = periodId;
       this.date = date;
       this.time = time;
    }
   
    public int getLectureId() {
        return this.lectureId;
    }
    
    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
    public int getMatkulId() {
        return this.matkulId;
    }
    
    public void setMatkulId(int matkulId) {
        this.matkulId = matkulId;
    }
    public int getPeriodId() {
        return this.periodId;
    }
    
    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClassSessionId) ) return false;
		 ClassSessionId castOther = ( ClassSessionId ) other; 
         
		 return (this.getLectureId()==castOther.getLectureId())
 && (this.getMatkulId()==castOther.getMatkulId())
 && (this.getPeriodId()==castOther.getPeriodId())
 && ( (this.getDate()==castOther.getDate()) || ( this.getDate()!=null && castOther.getDate()!=null && this.getDate().equals(castOther.getDate()) ) )
 && ( (this.getTime()==castOther.getTime()) || ( this.getTime()!=null && castOther.getTime()!=null && this.getTime().equals(castOther.getTime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getLectureId();
         result = 37 * result + this.getMatkulId();
         result = 37 * result + this.getPeriodId();
         result = 37 * result + ( getDate() == null ? 0 : this.getDate().hashCode() );
         result = 37 * result + ( getTime() == null ? 0 : this.getTime().hashCode() );
         return result;
   }   


}


