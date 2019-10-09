package it.polito.tdp.alien;

import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Word {
	private String alienW;
	private List<String> traduzioni= new LinkedList<String>();
	//private AlienDictionary dizionario = new AlienDictionary ();

    //private List <String> listaW = new LinkedList <String>();
    public Word(String alienW ) {
    	this.alienW= alienW;
    	
		
	}
    	
    
	public String getAlienW() {
		return alienW;
	}
	public List<String >getTraduzioni() {
		return traduzioni;
	}
	public void setTraduzioni(String traduzione) {
		traduzioni.add(traduzione);
		//dizionario.put(alienW, traduzione);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienW == null) ? 0 : alienW.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienW == null) {
			if (other.alienW != null)
				return false;
		} else if (!alienW.equals(other.alienW))
			return false;
		return true;
	}
	
	
	
	
	

}
