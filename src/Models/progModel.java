
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
public class progModel{
        private final StringProperty progID;
        private final StringProperty progCode;
        private final StringProperty progDes;
        
        public progModel(String id, String code, String des){
            this.progID = new SimpleStringProperty(id);
            this.progCode = new SimpleStringProperty(code);
            this.progDes = new SimpleStringProperty(des);
        }
        
        public StringProperty idProperty() {return progID;}
        public StringProperty progCodeProperty() {return progCode;}
        public StringProperty progDesProperty() {return progDes;}
        
        public String getID() {return progID.get();}

        public void setID(String a) {this.progID.set(a);}
        
        public String getprogCode() {return progCode.get();}

        public void setprogCode(String a) {this.progCode.set(a);}
        
        public String getprogDes() {return progDes.get();}

        public void setprogDes(String a) {this.progDes.set(a);}

}
