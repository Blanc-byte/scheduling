/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */

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
public class allinformationforsub{
        private final StringProperty subID;
        private final StringProperty subCode;
        private final StringProperty subName;
        private final StringProperty progg;
        private final StringProperty secc;
        private final StringProperty lecc;
        private final StringProperty labb;
        
        public allinformationforsub(String id, String code, String name, String prog, String sec, String lec, String lab){
            this.subID = new SimpleStringProperty(id);
            this.subCode = new SimpleStringProperty(code);
            this.subName = new SimpleStringProperty(name);
            this.progg = new SimpleStringProperty(prog);
            this.secc = new SimpleStringProperty(sec);
            this.lecc = new SimpleStringProperty(lec);
            this.labb = new SimpleStringProperty(lab);
            
        }
        
        public StringProperty idProperty() {return subID;}
        public StringProperty codeProperty() {return subCode;}
        public StringProperty nameProperty() {return subName;}
        public StringProperty progProperty() {return progg;}
        public StringProperty secProperty() {return secc;}
        public StringProperty lecProperty() {return lecc;}
        public StringProperty labProperty() {return labb;}
        
        public String getID() {return subID.get();}
        public void setID(String a) {this.subID.set(a);}
        
        public String getCode() {return subCode.get();}
        public void setCode(String a) {this.subCode.set(a);}
        
        public String getName() {return subName.get();}
        public void setName(String a) {this.subName.set(a);}
        
        public String getProg() {return progg.get();}
        public void setProg(String a) {this.progg.set(a);}
        
        public String getSec() {return secc.get();}
        public void setSec(String a) {this.secc.set(a);}
        
        public String getLec() {return lecc.get();}
        public void setLec(String a) {this.lecc.set(a);}
        
        public String getLab() {return labb.get();}
        public void setLab(String a) {this.labb.set(a);}
    
}

