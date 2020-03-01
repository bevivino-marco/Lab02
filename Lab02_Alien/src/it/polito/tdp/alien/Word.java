package it.polito.tdp.alien;

public class Word {
private String alienWord;
private String traduzione;
public Word(String alienWord, String traduzione) {
	
	this.alienWord = alienWord;
	this.traduzione = traduzione;
}
public boolean equals (Word w) {
	if (this.alienWord.trim()==w.alienWord)
	return true;
	return false;
	
}
public String getAlienWord() {
	return alienWord;
}
public void setAlienWord(String alienWord) {
	this.alienWord = alienWord;
}
public String getTraduzione() {
	return traduzione;
}
public void setTraduzione(String traduzione) {
	this.traduzione = traduzione;
}

}
