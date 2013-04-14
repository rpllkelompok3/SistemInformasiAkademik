package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Rooms generated by hbm2java
 */
public class Rooms  implements java.io.Serializable {


     private int roomId;
     private String roomType;
     private String roomLocation;
     private Set takeRoomses = new HashSet(0);

    public Rooms() {
    }

	
    public Rooms(int roomId, String roomType, String roomLocation) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomLocation = roomLocation;
    }
    public Rooms(int roomId, String roomType, String roomLocation, Set takeRoomses) {
       this.roomId = roomId;
       this.roomType = roomType;
       this.roomLocation = roomLocation;
       this.takeRoomses = takeRoomses;
    }
   
    public int getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public String getRoomLocation() {
        return this.roomLocation;
    }
    
    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }
    public Set getTakeRoomses() {
        return this.takeRoomses;
    }
    
    public void setTakeRoomses(Set takeRoomses) {
        this.takeRoomses = takeRoomses;
    }




}


