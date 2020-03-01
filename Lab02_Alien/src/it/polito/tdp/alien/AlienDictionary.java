package it.polito.tdp.alien;

import java.security.InvalidParameterException;
import java.util.*;

public class AlienDictionary {
	List <Word> listaW ;

	public AlienDictionary() {
		this.listaW = new LinkedList <Word>();
	}
	public void addWord (String aW, String t) {
		Word w = new Word (aW, t);
		boolean trovato = false;
		if (!listaW.contains(w)) {
			for ( Word w1 : listaW) {
				if(w1.getAlienWord()==aW) {
					listaW.remove(w1);
					listaW.add(w);
					trovato = true;
				}
					
			}
			if ( trovato ==false) {
			listaW.add(w);
		}
		}
		
		
	}
	
	public String translateWord (String AlienWord) {
		boolean trovato = false;
		for (Word w : listaW) {
			if (w.getAlienWord().equals(AlienWord)) {
				return w.getTraduzione();
				
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
	 for (Word w :listaW) {
		 s += w.getAlienWord()+" "+w.getTraduzione()+"\n";
	 }
	 return s+" , "+listaW.size();
	}

}
