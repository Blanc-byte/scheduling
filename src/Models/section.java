
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
public class section{
        private final StringProperty progID;
        private final StringProperty secName;
        
        public section(String id, String code){
            this.progID = new SimpleStringProperty(id);
            this.secName = new SimpleStringProperty(code);
        }
        
        public StringProperty idProperty() {return progID;}
        public StringProperty nameProperty() {return secName;}
        
        public String getID() {return progID.get();}

        public void setID(String a) {this.progID.set(a);}
        
        public String getName() {return secName.get();}

        public void setName(String a) {this.secName.set(a);}

}
