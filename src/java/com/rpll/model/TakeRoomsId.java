package com.rpll.model;
// Generated Apr 26, 2013 8:19:43 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * TakeRoomsId generated by hbm2java
 */
public class TakeRoomsId  implements java.io.Serializable {


     private int matkulId;
     private int lectureId;
     private int roomId;
     private Date timeStart;

    public TakeRoomsId() {
    }

    public TakeRoomsId(int matkulId, int lectureId, int roomId, Date timeStart) {
       this.matkulId = matkulId;
       this.lectureId = lectureId;
       this.roomId = roomId;
       this.timeStart = timeStart;
    }
   
    public int getMatkulId() {
        return this.matkulId;
    }
    
    public void setMatkulId(int matkulId) {
        this.matkulId = matkulId;
    }
    public int getLectureId() {
        return this.lectureId;
    }
    
    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
    public int getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public Date getTimeStart() {
        return this.timeStart;
    }
    
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TakeRoomsId) ) return false;
		 TakeRoomsId castOther = ( TakeRoomsId ) other; 
         
		 return (this.getMatkulId()==castOther.getMatkulId())
 && (this.getLectureId()==castOther.getLectureId())
 && (this.getRoomId()==castOther.getRoomId())
 && ( (this.getTimeStart()==castOther.getTimeStart()) || ( this.getTimeStart()!=null && castOther.getTimeStart()!=null && this.getTimeStart().equals(castOther.getTimeStart()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMatkulId();
         result = 37 * result + this.getLectureId();
         result = 37 * result + this.getRoomId();
         result = 37 * result + ( getTimeStart() == null ? 0 : this.getTimeStart().hashCode() );
         return result;
   }   


}


