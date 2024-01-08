
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
public class adminModel {
        private final StringProperty user;
        private final StringProperty pass;

        public adminModel(String u,String p) {
            this.user = new SimpleStringProperty(u);
            this.pass = new SimpleStringProperty(p);
        }
        
        public StringProperty usernameProperty() {return user;}
        public StringProperty passwordProperty() {return pass;}
        
        public String getuser() {return user.get();}

        public void setuser(String a) {this.user.set(a);}

        public String getpass() {return pass.get();}

        public void setpass(String a) {this.pass.set(a);}

    }
