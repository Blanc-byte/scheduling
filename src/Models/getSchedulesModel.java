/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class getSchedulesModel {
    private final StringProperty idOfSub;
    private final StringProperty idOfSec;
    private final StringProperty time;
    private final StringProperty days;
    private final StringProperty sem;
    private final StringProperty sy;
    private final StringProperty status;
    private final StringProperty idOfFac;
    private final StringProperty lec;
    private final StringProperty lab;
    private final StringProperty noOfStudents;
    private final StringProperty room;

    public getSchedulesModel(String idOfSub, String idOfSec, String time, String days, String sem, String sy, String status,String idOfFac, String lec, String lab, String noOfStudents, String room){
        this.idOfSub = new SimpleStringProperty(idOfSub);
        this.idOfSec = new SimpleStringProperty(idOfSec);
        this.time = new SimpleStringProperty(time);
        this.days = new SimpleStringProperty(days);
        this.sem = new SimpleStringProperty(sem);
        this.sy = new SimpleStringProperty(sy);
        this.status = new SimpleStringProperty(status);
        this.idOfFac = new SimpleStringProperty(idOfFac);
        this.lec = new SimpleStringProperty(lec);
        this.lab = new SimpleStringProperty(lab);
        this.noOfStudents = new SimpleStringProperty(noOfStudents);
        this.room = new SimpleStringProperty(room);
    }

    public StringProperty idOfSubProperty() {return idOfSub;}
    public StringProperty idOfSecProperty() {return idOfSec;}
    public StringProperty timeProperty() {return time;}
    public StringProperty daysProperty() {return days;}
    public StringProperty semProperty() {return sem;}
    public StringProperty syProperty() {return sy;}
    public StringProperty statusProperty() {return status;}
    public StringProperty idOfFacProperty() {return idOfFac;}
    public StringProperty lecProperty() {return lec;}
    public StringProperty labProperty() {return lab;}
    public StringProperty noOfStudentsProperty() {return noOfStudents;}
    public StringProperty roomProperty() {return room;}

    public String getidOfSub() {return idOfSub.get();}
    public void setidOfSub(String a) {this.idOfSub.set(a);}
    
    public String getidOfSec() {return idOfSec.get();}
    public void setidOfSec(String a) {this.idOfSec.set(a);}
    
    public String gettime() {return time.get();}
    public void settime(String a) {this.time.set(a);}
    
    public String getdays() {return days.get();}
    public void setdays(String a) {this.days.set(a);}
    
    public String getsem() {return sem.get();}
    public void setsem(String a) {this.sem.set(a);}
    
    public String getsy() {return sy.get();}
    public void setsy(String a) {this.sy.set(a);}
    
    public String getstatus() {return status.get();}
    public void setstatus(String a) {this.status.set(a);}
    
    public String getidOfFac() {return idOfFac.get();}
    public void setidOfFac(String a) {this.idOfFac.set(a);}
    
    public String getlec() {return lec.get();}
    public void setlec(String a) {this.lec.set(a);}
    
    public String getlab() {return lab.get();}
    public void setlab(String a) {this.lab.set(a);}
    
    public String getnoOfStudents() {return noOfStudents.get();}
    public void setnoOfStudents(String a) {this.noOfStudents.set(a);}
    
    public String getroom() {return room.get();}
    public void setroom(String a) {this.room.set(a);}
        
}
