package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


import java.io.*;
import java.net.URL;
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
    	txtResult.clear();
    	String stringa = txtWord.getText();
    	stringa.trim();
    	
    	String aw= "";
    	String tr="";
    	Word alienW = new Word (aw);
    	/*try {
    		int indirizzo = stringa.indexOf(" ");
    		tr = stringa.substring(indirizzo+2, stringa.length()-1).toLowerCase();
    		aw = stringa.substring(1, stringa.indexOf(">")).toLowerCase();
    	} catch (Exception e) {
    		txtResult.appendText("inserire un formato corretto <> <>");
    	}*/
    	if (stringa.contains(" "))
    	
    	{
    		int indirizzo = stringa.indexOf(" ");
    		tr = stringa.substring(indirizzo+2, stringa.length()-1).toLowerCase();
    		aw = stringa.substring(1, stringa.indexOf(">")).toLowerCase();	
    	    alienW.setTraduzione(tr);
    	}
    	else {
    		aw = stringa.substring(1,stringa.length()-1).toLowerCase();
    		txtResult.appendText(alienW.getTraduzione());
    	
    	
    	}/*Object w1 = "";
		Object w2 = "";
		stringa.format("<%d> <&d>", w1 ,  w2);
		dizionario.put(w1, w2);
		
		txtResult.appendText(w1.toString()+"trad in "+ w2.toString());*/
       
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
