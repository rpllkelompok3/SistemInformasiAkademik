package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * TakeRooms generated by hbm2java
 */
public class TakeRooms  implements java.io.Serializable {


     private TakeRoomsId id;
     private Matkul matkul;
     private Lectures lectures;
     private Rooms rooms;
     private String day;
     private Date timeFinish;

    public TakeRooms() {
    }

    public TakeRooms(TakeRoomsId id, Matkul matkul, Lectures lectures, Rooms rooms, String day, Date timeFinish) {
       this.id = id;
       this.matkul = matkul;
       this.lectures = lectures;
       this.rooms = rooms;
       this.day = day;
       this.timeFinish = timeFinish;
    }
   
    public TakeRoomsId getId() {
        return this.id;
    }
    
    public void setId(TakeRoomsId id) {
        this.id = id;
    }
    public Matkul getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }
    public Lectures getLectures() {
        return this.lectures;
    }
    
    public void setLectures(Lectures lectures) {
        this.lectures = lectures;
    }
    public Rooms getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    public Date getTimeFinish() {
        return this.timeFinish;
    }
    
    public void setTimeFinish(Date timeFinish) {
        this.timeFinish = timeFinish;
    }




}


