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
public class getRoomScheduleModel {
    private final StringProperty time;
    private final StringProperty days;
    private final StringProperty subject;
    private final StringProperty section;
    private final StringProperty program;
    private final StringProperty room;

    public getRoomScheduleModel(String TIME, String DAYS, String SUBJECT, String SECTION, String PROGRAM, String ROOM){
        this.time = new SimpleStringProperty(TIME);
        this.days = new SimpleStringProperty(DAYS);
        this.subject = new SimpleStringProperty(SUBJECT);
        this.section = new SimpleStringProperty(SECTION);
        this.program = new SimpleStringProperty(PROGRAM);
        this.room = new SimpleStringProperty(ROOM);
    }

    public StringProperty timeProperty() {return time;}
    public StringProperty daysProperty() {return days;}
    public StringProperty subjectProperty() {return subject;}
    public StringProperty sectionProperty() {return section;}
    public StringProperty programProperty() {return program;}
    public StringProperty roomProperty() {return room;}

    public String gettime() {return time.get();}
    public void settime(String a) {this.time.set(a);}

    public String getdays() {return days.get();}
    public void setdays(String a) {this.days.set(a);}

    public String getsubject() {return subject.get();}
    public void setsubject(String a) {this.subject.set(a);}

    public String getsection() {return section.get();}
    public void setsection(String a) {this.section.set(a);}

    public String getprogram() {return program.get();}
    public void setprogram(String a) {this.program.set(a);}
    
    public String getroom() {return room.get();}
    public void setroom(String a) {this.room.set(a);}

}
