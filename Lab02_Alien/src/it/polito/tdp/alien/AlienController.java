package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

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
    private AlienDictionary aD = new AlienDictionary ();
    private List <String> lW = new ArrayList<String>();
        
    
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
    	String riga = txtWord.getText().toLowerCase();
    	if (txtWord != null) {
    		StringTokenizer st = new StringTokenizer (riga," ");
    	    if (!st.hasMoreElements()) {
    	    	txtResult.appendText(" inserire una o due parole");
    	    	return;
    	    }
    	    	String alienW = st.nextToken().toString().toLowerCase();
    	    	// se inserisco parola e traduzione
    	    	if(st.hasMoreTokens()) {
    	    		String traduzione = st.nextToken().toString().toLowerCase();
    	    		if (!alienW.matches("[a-zA-Z]*")|| !traduzione.matches("[a-zA-Z]*") ) {
    	    			txtResult.appendText(" inserire un formato corretto");
    	    	    	return;
    	    	    	}
    	    		else {
    	    			aD.aggiungiTraduzione(alienW, traduzione);
    	    			txtResult.appendText("la parola " +alienW+ "è stata aggiunta con la traduzione : "+traduzione);
    	    			
    	    		}
    	    		
    	    		}else { // se contiene solo alienW
    	    		
    	    		      if (!alienW.matches("[a-zA-Z?]*")) {
    	    			txtResult.appendText("inserire solo caratteri alfabetici");
    	    		     }
    	    		      if (alienW.matches("[a-zA-Z?]*") && !alienW.matches("[a-zA-Z]*")) {
    	    		    	 //System.out.println(aD.getListaW().toString());
    	    		    	 txtResult.appendText( aD.cercaTraduzioniConWildCard(alienW));
    	    		      }
    	    		      if (!alienW.matches("[a-zA-Z?]*") && alienW.matches("[a-zA-Z]*")) {
    	    		    	  //System.out.println(aD.getListaW().toString());
    	    		    	  txtResult.appendText(aD.cercaTraduzioni(alienW));
    	    		      }
    	    		
    	    			
    	    		}
    	    		
    	    	txtResult.appendText(aD.getListaW().toString());
      		}
    
    }
    	    	

    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
