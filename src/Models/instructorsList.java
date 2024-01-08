
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class instructorsList {
        private final StringProperty id;
        private final StringProperty fname;
        private final StringProperty mname;
        private final StringProperty lname;
        private final StringProperty suffix;
        private final StringProperty sex;
        private final StringProperty expertise;
        private final StringProperty contact;
        private final StringProperty gmail;
        private final StringProperty address;
        private final StringProperty status;
        private final StringProperty designation;

        public instructorsList(String id,String fname, String mname, String lname, String suffix, String sex, String expertise, String contact, String gmail, String address, String status,String desig) {
            this.id = new SimpleStringProperty(id);
            this.fname = new SimpleStringProperty(fname);
            this.mname = new SimpleStringProperty(mname);
            this.lname = new SimpleStringProperty(lname);
            this.suffix = new SimpleStringProperty(suffix);
            this.sex = new SimpleStringProperty(sex);
            this.expertise = new SimpleStringProperty(expertise);
            this.contact = new SimpleStringProperty(contact);
            this.gmail = new SimpleStringProperty(gmail);
            this.address = new SimpleStringProperty(address);
            this.status = new SimpleStringProperty(status);
            this.designation = new SimpleStringProperty(desig);
        }
        
        public StringProperty idProperty() {return id;}
        public StringProperty fnameProperty() {return fname;}
        public StringProperty mnameProperty() {return mname;}
        public StringProperty lnameProperty() {return lname;}
        public StringProperty suffixProperty() {return suffix;}
        public StringProperty sexProperty() {return sex;}
        public StringProperty expertiseProperty() {return expertise;}
        public StringProperty contactProperty() {return contact;}
        public StringProperty gmailProperty() {return gmail;}
        public StringProperty addressProperty() {return address;}
        public StringProperty statusProperty() {return status;}
        public StringProperty designationProperty() {return designation;}
        
        public String getfname() {return fname.get();}

        public void setfname(String a) {this.fname.set(a);}

        public String getmname() {return mname.get();}

        public void setmname(String a) {this.mname.set(a);}

        public String getlname() {return lname.get();}

        public void setlname(String a) {this.lname.set(a);}

        public String getSuffix() {return suffix.get();}

        public void setSuffix(String a) {this.suffix.set(a);}
        
        public String getSex() {return sex.get();}

        public void setSex(String a) {this.sex.set(a);}
        
        public String getExpertise() {return expertise.get();}

        public void setExpertise(String a) {this.expertise.set(a);}
        
        public String getContact() {return contact.get();}

        public void setContact(String a) {this.contact.set(a);}
        
        public String getGmail() {return gmail.get();}

        public void setGmail(String a) {this.gmail.set(a);}
        
        public String getAddress() {return address.get();}

        public void setAddress(String a) {this.address.set(a);}
        
        public String getID() {return id.get();}

        public void setID(String a) {this.id.set(a);}
        
        public String getstatus() {return status.get();}

        public void setstatus(String a) {this.status.set(a);}
        
        public String getdesignation() {return designation.get();}

        public void setdesignation(String a) {this.designation.set(a);}
    }
