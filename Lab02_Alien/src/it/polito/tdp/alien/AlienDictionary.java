package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	List <WordEnhanced> listaW = new LinkedList <WordEnhanced>();




	public void setListaW(WordEnhanced aW) {
		if (!this.listaW.contains(aW))
		this.listaW.add(aW);
	}
	public List<WordEnhanced> getListaW() {
		return listaW;
	}
	}
