package com.rpll.model;
// Generated Apr 26, 2013 8:19:43 PM by Hibernate Tools 3.2.1.GA



/**
 * Modul generated by hbm2java
 */
public class Modul  implements java.io.Serializable {


     private ModulId id;
     private Matkul matkul;
     private String modulContent;

    public Modul() {
    }

    public Modul(ModulId id, Matkul matkul, String modulContent) {
       this.id = id;
       this.matkul = matkul;
       this.modulContent = modulContent;
    }
   
    public ModulId getId() {
        return this.id;
    }
    
    public void setId(ModulId id) {
        this.id = id;
    }
    public Matkul getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }
    public String getModulContent() {
        return this.modulContent;
    }
    
    public void setModulContent(String modulContent) {
        this.modulContent = modulContent;
    }




}


