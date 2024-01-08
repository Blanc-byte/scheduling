
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */public class FacultyProfileController {
      @FXML

    private AnchorPane pane;
      @FXML
    private TextField a,b,c,d,f,g,h,i1,j,k;
      @FXML
      private ChoiceBox e;
      ObservableList<instructorsList> faculties = FXCollections.observableArrayList();
      DatabaseConnection dc = new DatabaseConnection();
    @FXML
    private void closeOverlay() {
        // Close the overlay 
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
    boolean checker = false;
    String idk = "";
    public void initialize()throws Exception{
        getFacultyInfo("176");
        getFacultyInfo(idk);
    }
public void getFacultyInfo(String idd)throws Exception{
    idk=idd;
    System.out.println(idd);
    dc.connect();
    Statement statement = dc.con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty WHERE facultyID = "+idd);
        while(resultSet.next()){
        String i = resultSet.getString("facultyID");
        String ii = resultSet.getString("firstname");
        String iii = resultSet.getString("middlename");
        String iv = resultSet.getString("lastname");
        String v = resultSet.getString("suffix");
        String vi = resultSet.getString("sex");
        String vii = resultSet.getString("expertise");
        String viii = resultSet.getString("contact");
        String viv = resultSet.getString("gmail");
        String x = resultSet.getString("address");
        String xi = resultSet.getString("status"); 
        String xii = resultSet.getString("adminDesignation");
        faculties.add(new instructorsList(i,ii,iii,iv,v,vi,vii,viii,viv,x,xi,xii));
        if(checker){
            
        
        a.setText(ii);
        b.setText(iii);
        c.setText(iv);
        d.setText(v);
        e.setValue(vi);
        f.setText(vii);
        g.setText(viii);
        h.setText(viv);
        i1.setText(x);
        j.setText(xi);
        k.setText(xii);
        }
        checker=true;
        }
}
}
