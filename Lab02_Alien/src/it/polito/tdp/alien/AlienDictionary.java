package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List <WordEnhanced> listaW ;

     public AlienDictionary () {
    	 this.listaW = new LinkedList <WordEnhanced>();
     }


     
	public void aggiungiTraduzione(String aW, String trad) {
		WordEnhanced word = new WordEnhanced (aW);
		if (this.listaW.contains(word)) {
			listaW.get(listaW.indexOf(word)).setTraduzioni(trad);
		}else {
			listaW.add(word);
			word.setTraduzioni(trad);
		}
		
	}
	public String getListaW() {
		String s = "";
		for (WordEnhanced w : listaW) {
			s+= "\n"+w.getaW()+w.getTraduzioni().toString()+"\n";
		}
		//return listaW;
		return s;
	}
	public String cercaTraduzioni (String aW) {
		for (WordEnhanced w : listaW) {
		 
		 
			if (w.getaW().equals(aW)) {
				w.getTraduzioni();
			}
		}
		return null;
		/*WordEnhanced w = new WordEnhanced (aW);
		if (listaW.contains(w))
			return listaW.get(listaW.indexOf(w)).getTraduzioni();
		return null;
		*/
	}
	public String cercaTraduzioniConWildCard (String wild) {
		wild = wild.replace("\\?", ".");
		boolean trovati =false;
		StringBuilder sb = new StringBuilder();
		for (WordEnhanced w : listaW) {
			if (w.compareWild(wild)){
				trovati = true;
				sb.append(w.getTraduzioni()+"\n");
			}
		}
		if (trovati==true) {
			 return sb.toString();
			
		}else
			return null;
	}
	}
