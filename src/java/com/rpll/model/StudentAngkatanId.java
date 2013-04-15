package com.rpll.model;
// Generated Apr 15, 2013 2:00:19 PM by Hibernate Tools 3.2.1.GA



/**
 * StudentAngkatanId generated by hbm2java
 */
public class StudentAngkatanId  implements java.io.Serializable {


     private int studentId;
     private int angkatanId;
     private int departmentId;

    public StudentAngkatanId() {
    }

    public StudentAngkatanId(int studentId, int angkatanId, int departmentId) {
       this.studentId = studentId;
       this.angkatanId = angkatanId;
       this.departmentId = departmentId;
    }
   
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudentAngkatanId) ) return false;
		 StudentAngkatanId castOther = ( StudentAngkatanId ) other; 
         
		 return (this.getStudentId()==castOther.getStudentId())
 && (this.getAngkatanId()==castOther.getAngkatanId())
 && (this.getDepartmentId()==castOther.getDepartmentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getStudentId();
         result = 37 * result + this.getAngkatanId();
         result = 37 * result + this.getDepartmentId();
         return result;
   }   


}


