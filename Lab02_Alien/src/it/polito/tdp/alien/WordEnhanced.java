package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
private String alienWord;
//private String traduzione;
private List <String>traduzioni;
public WordEnhanced(String alienWord) {
	
	this.alienWord = alienWord;
//	this.traduzione = traduzione;
	traduzioni = new LinkedList <String>();
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	WordEnhanced other = (WordEnhanced) obj;
	if (alienWord == null) {
		if (other.alienWord != null)
			return false;
	} else if (!alienWord.equals(other.alienWord))
		return false;
	return true;
}

public String getAlienWord() {
	return alienWord;
}
public void setAlienWord(String alienWord) {
	this.alienWord = alienWord;
}
public void addTraduzione(String t) {
	if (!traduzioni.contains(t))
	traduzioni.add(t);
}
public String getTraduzioni() {
	String s ="";
	for (String t :traduzioni) {
		s+= t+"\n";
	}
	return s;
}

}
