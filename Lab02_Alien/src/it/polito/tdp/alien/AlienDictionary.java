package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List <WordEnhanced> listaW ;

     public AlienDictionary () {
    	 this.listaW = new LinkedList <WordEnhanced>();
     }


     
	public void aggiungiTraduzione(WordEnhanced aW) {
		if (!this.listaW.contains(aW))
		this.listaW.add(aW);
	}
	public List<WordEnhanced> getListaW() {
		return listaW;
	}
	}
