package it.polito.tdp.alien;

import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Word {
	private String alienW;
	private String traduzione;
	private AlienDictionary dizionario = new AlienDictionary ();

    //private List <String> listaW = new LinkedList <String>();
    public Word(String alienW) {
    	this.alienW= alienW;
		
	}
	public boolean equals (Object w) {
    	if (w.equals(alienW))
		return true;
    	else return false;
    	
    }
	public String getAlienW() {
		return alienW;
	}
	public String getTraduzione() {
		return traduzione;
	}
	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
		dizionario.put(alienW, traduzione);
	}
	
	

}
