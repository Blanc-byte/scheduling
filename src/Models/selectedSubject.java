
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
public class selectedSubject{
        private final StringProperty subID;
        private final StringProperty subCode;
        private final StringProperty subName;
        
        public selectedSubject(String id, String code, String name){
            this.subID = new SimpleStringProperty(id);
            this.subCode = new SimpleStringProperty(code);
            this.subName = new SimpleStringProperty(name);
        }
        
        public StringProperty idProperty() {return subID;}
        public StringProperty codeProperty() {return subCode;}
        public StringProperty nameProperty() {return subName;}
        
        public String getID() {return subID.get();}

        public void setID(String a) {this.subID.set(a);}
        
        public String getCode() {return subCode.get();}

        public void setCode(String a) {this.subCode.set(a);}
        
        public String getName() {return subName.get();}

        public void setName(String a) {this.subName.set(a);
    }
}
