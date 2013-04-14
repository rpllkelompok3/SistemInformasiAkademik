package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * MatkulType generated by hbm2java
 */
public class MatkulType  implements java.io.Serializable {


     private Integer matkulType;
     private String typeName;
     private Set matkuls = new HashSet(0);

    public MatkulType() {
    }

	
    public MatkulType(String typeName) {
        this.typeName = typeName;
    }
    public MatkulType(String typeName, Set matkuls) {
       this.typeName = typeName;
       this.matkuls = matkuls;
    }
   
    public Integer getMatkulType() {
        return this.matkulType;
    }
    
    public void setMatkulType(Integer matkulType) {
        this.matkulType = matkulType;
    }
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public Set getMatkuls() {
        return this.matkuls;
    }
    
    public void setMatkuls(Set matkuls) {
        this.matkuls = matkuls;
    }




}


