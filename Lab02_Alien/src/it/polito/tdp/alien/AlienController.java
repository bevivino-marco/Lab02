package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


import java.io.*;
import java.util.*;
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
        StringTokenizer st = new StringTokenizer(stringa," ");
        if (stringa == null || stringa.length()==0) {
            txtResult.appendText("inserire una o due parole");
        	return;
        }
        
        if (!st.hasMoreElements()) {
        	txtResult.appendText("inserire una o due parole");
        	return;
        }
        String alienW = st.nextToken();
        if (st.hasMoreTokens()) {
        	String traduzione = st.nextToken();
        	if ( !alienW.matches("[a-zA-Z]*")|| !traduzione.matches("[a-zA-Z]*")){
        		
        		txtResult.appendText("inserire un formato corretto");
        		return;
        		
        	}
        	 
        	dizionario.put(alienW, traduzione);
        	txtResult.appendText("la parola : " + alienW+ " è stata inserita nel dizionario con la traduzione : " + traduzione);
         }else {
        	 txtResult.appendText(dizionario.get(alienW).toString());
         }
        
       
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
