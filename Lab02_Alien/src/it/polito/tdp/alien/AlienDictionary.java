package it.polito.tdp.alien;

import java.security.InvalidParameterException;
import java.util.*;

public class AlienDictionary {
	List <WordEnhanced> listaW ;

	public AlienDictionary() {
		this.listaW = new LinkedList <WordEnhanced>();
	}
	public void addWord (String aW, String t) {
		boolean trovato = false;
		for (WordEnhanced w : listaW) {
			if(w.getAlienWord().equals(aW)) {
				w.addTraduzione(t);
				trovato =true;
			}
		}if (trovato == false) {
			WordEnhanced w = new WordEnhanced (aW);
			listaW.add(w);
			w.addTraduzione(t);
		}
	}
	
	
	public String translateWord (String AlienWord) {
		boolean trovato = false;
		for (WordEnhanced w : listaW) {
			if (w.getAlienWord().equals(AlienWord)) {
				return w.getTraduzioni();
				
			}
		}
		throw new InvalidParameterException ("La parola inserita non è presente nel dizinario");
	/* 	String s="";
	for (Word w :listaW) {
		 s += w.getAlienWord()+" "+w.getTraduzione()+"\n";
	 }
	 return s+" , "+listaW.size();*/
	
	}
	public String getLista() {
		String s="";
	 for (WordEnhanced w :listaW) {
		 s += w.getAlienWord()+" "+w.getTraduzioni()+"\n";
	 }
	 return s+" , "+listaW.size();
	}

}
