package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    private AlienDictionary dizionario = new AlienDictionary();
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String [] s;
    	String testo = txtWord.getText().toLowerCase().trim();
    	if (testo.matches("[^a-z]"))
    		throw new InvalidParameterException ("inserire una parola corretta");

    	s= txtWord.getText().split(" ");
    	if (s.length==2) {
    		String aW = s[0].trim();
    		String t = s[1].trim();
    		txtResult.clear();
    		dizionario.addWord(aW, t);
    	//	txtResult.appendText("----"+s[0]+"........"+s[1]+"\n");
    	}
    	if (s.length==1) {
    		String a = s[0].trim();
    		txtResult.clear();
    		txtResult.appendText(dizionario.translateWord(a));
    //		txtResult.appendText("----"+s[0]+"........");

    	}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
