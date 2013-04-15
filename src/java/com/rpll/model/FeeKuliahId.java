package com.rpll.model;
// Generated Apr 15, 2013 2:00:19 PM by Hibernate Tools 3.2.1.GA



/**
 * FeeKuliahId generated by hbm2java
 */
public class FeeKuliahId  implements java.io.Serializable {


     private int angkatanId;
     private int departmentId;

    public FeeKuliahId() {
    }

    public FeeKuliahId(int angkatanId, int departmentId) {
       this.angkatanId = angkatanId;
       this.departmentId = departmentId;
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
		 if ( !(other instanceof FeeKuliahId) ) return false;
		 FeeKuliahId castOther = ( FeeKuliahId ) other; 
         
		 return (this.getAngkatanId()==castOther.getAngkatanId())
 && (this.getDepartmentId()==castOther.getDepartmentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAngkatanId();
         result = 37 * result + this.getDepartmentId();
         return result;
   }   


}


