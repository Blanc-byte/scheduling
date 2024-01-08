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
public class schedModel{
        private final StringProperty courseNo;
        private final StringProperty courseDes;
        private final StringProperty lec;
        private final StringProperty lab;
        private final StringProperty total;
        private final StringProperty prog;
        private final StringProperty sec;
        private final StringProperty days;
        private final StringProperty time;
        private final StringProperty room;
        private final StringProperty facID;
        private final StringProperty noOfStudents;
        private final StringProperty status;
        private final StringProperty sectionID;
        
        public schedModel(String id, String code, String name, String prog, String sec, String lec, String lab,String da, String ti, String ro, String fac, String noStud, String stat, String secID){
            this.courseNo = new SimpleStringProperty(id);
            this.courseDes = new SimpleStringProperty(code);
            this.lec = new SimpleStringProperty(name);
            this.lab = new SimpleStringProperty(prog);
            this.total = new SimpleStringProperty(sec);
            this.prog = new SimpleStringProperty(lec);
            this.sec = new SimpleStringProperty(lab);
            this.days = new SimpleStringProperty(da);
            this.time = new SimpleStringProperty(ti);
            this.room = new SimpleStringProperty(ro);
            this.facID = new SimpleStringProperty(fac);
            this.noOfStudents = new SimpleStringProperty(noStud);
            this.status = new SimpleStringProperty(stat);
            this.sectionID = new SimpleStringProperty(secID);
        }
        
        public StringProperty courseNoProperty() {return courseNo;}
        public StringProperty courseDesProperty() {return courseDes;}
        public StringProperty lecProperty() {return lec;}
        public StringProperty labProperty() {return lab;}
        public StringProperty totalProperty() {return total;}
        public StringProperty progProperty() {return prog;}
        public StringProperty secProperty() {return sec;}
        public StringProperty daysProperty() {return days;}
        public StringProperty timeProperty() {return time;}
        public StringProperty roomProperty() {return room;}
        public StringProperty facultyIDProperty() {return facID;}
        public StringProperty noOfStudentsProperty() {return noOfStudents;}
        public StringProperty statusProperty() {return status;}
        public StringProperty sectionIDProperty() {return sectionID;}
        
        public String getstatus() {return status.get();}
        public void setstatus(String a) {this.status.set(a);}
        
        public String getcourseNo() {return courseNo.get();}
        public void setcourseNo(String a) {this.courseNo.set(a);}
        
        public String getcourseDes() {return courseDes.get();}
        public void setcourseDes(String a) {this.courseDes.set(a);}
        
        public String getlec() {return lec.get();}
        public void setlec(String a) {this.lec.set(a);}
        
        public String getlab() {return lab.get();}
        public void setlab(String a) {this.lab.set(a);}
        
        public String gettotal() {return total.get();}
        public void settotal(String a) {this.total.set(a);}
        
        public String getprog() {return prog.get();}
        public void setprog(String a) {this.prog.set(a);}
        
        public String getsec() {return sec.get();}
        public void setsec(String a) {this.sec.set(a);}
        
        public String getdays() {return days.get();}
        public void setdays(String a) {this.days.set(a);}
        
        public String gettime() {return time.get();}
        public void settime(String a) {this.time.set(a);}
        
        public String getroom() {return room.get();}
        public void setroom(String a) {this.room.set(a);}
        
        public String getfacultyID() {return facID.get();}
        public void setfacultyID(String a) {this.facID.set(a);}
        
        public String getnoOfStudents() {return noOfStudents.get();}
        public void setnoOfStudents(String a) {this.noOfStudents.set(a);}
        
        public String getsectionID() {return sectionID.get();}
        public void setsectionID(String a) {this.sectionID.set(a);}
}
