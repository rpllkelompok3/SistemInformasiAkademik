package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ModulId generated by hbm2java
 */
public class ModulId  implements java.io.Serializable {


     private int modulId;
     private int matkulId;
     private Date releaseDate;

    public ModulId() {
    }

    public ModulId(int modulId, int matkulId, Date releaseDate) {
       this.modulId = modulId;
       this.matkulId = matkulId;
       this.releaseDate = releaseDate;
    }
   
    public int getModulId() {
        return this.modulId;
    }
    
    public void setModulId(int modulId) {
        this.modulId = modulId;
    }
    public int getMatkulId() {
        return this.matkulId;
    }
    
    public void setMatkulId(int matkulId) {
        this.matkulId = matkulId;
    }
    public Date getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModulId) ) return false;
		 ModulId castOther = ( ModulId ) other; 
         
		 return (this.getModulId()==castOther.getModulId())
 && (this.getMatkulId()==castOther.getMatkulId())
 && ( (this.getReleaseDate()==castOther.getReleaseDate()) || ( this.getReleaseDate()!=null && castOther.getReleaseDate()!=null && this.getReleaseDate().equals(castOther.getReleaseDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getModulId();
         result = 37 * result + this.getMatkulId();
         result = 37 * result + ( getReleaseDate() == null ? 0 : this.getReleaseDate().hashCode() );
         return result;
   }   


}


