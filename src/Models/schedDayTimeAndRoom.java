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
public class schedDayTimeAndRoom{
        private final StringProperty days;
        private final StringProperty time;
        private final StringProperty room;
        
        public schedDayTimeAndRoom(String da, String ti, String ro){
            this.days = new SimpleStringProperty(da);
            this.time = new SimpleStringProperty(ti);
            this.room = new SimpleStringProperty(ro);
        }
        
        public StringProperty daysProperty() {return days;}
        public StringProperty timeProperty() {return time;}
        public StringProperty roomProperty() {return room;}
        
        public String getdays() {return days.get();}
        public void setdays(String a) {this.days.set(a);}
        
        public String gettime() {return time.get();}
        public void settime(String a) {this.time.set(a);}
        
        public String getroom() {return room.get();}
        public void setroom(String a) {this.room.set(a);}
    
}
