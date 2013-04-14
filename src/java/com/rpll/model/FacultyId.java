package com.rpll.model;
// Generated Apr 13, 2013 8:51:10 PM by Hibernate Tools 3.2.1.GA



/**
 * FacultyId generated by hbm2java
 */
public class FacultyId  implements java.io.Serializable {


     private int angkatanId;
     private int departmentId;
     private int univId;

    public FacultyId() {
    }

    public FacultyId(int angkatanId, int departmentId, int univId) {
       this.angkatanId = angkatanId;
       this.departmentId = departmentId;
       this.univId = univId;
    }
   
    public int getAngkatanId() {
        return this.angkatanId;
    }
    
    public void setAngkatanId(int angkatanId) {
        this.angkatanId = angkatanId;
    }
    public int getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public int getUnivId() {
        return this.univId;
    }
    
    public void setUnivId(int univId) {
        this.univId = univId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FacultyId) ) return false;
		 FacultyId castOther = ( FacultyId ) other; 
         
		 return (this.getAngkatanId()==castOther.getAngkatanId())
 && (this.getDepartmentId()==castOther.getDepartmentId())
 && (this.getUnivId()==castOther.getUnivId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAngkatanId();
         result = 37 * result + this.getDepartmentId();
         result = 37 * result + this.getUnivId();
         return result;
   }   


}


