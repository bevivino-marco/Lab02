package it.polito.tdp.alien;

public class Test {
	public static void main (String[] args) {
	AlienDictionary al = new AlienDictionary();
	Word w1 = new Word ("w1", "t1");
	Word w2 = new Word ("w1", "t2");

	al.addWord("w1", "t1");
	al.addWord("w1", "t2");
	al.addWord("w2", "t3");
	al.addWord("w3", "t4");
	al.addWord("w4", "t5");
	al.addWord("w5", "t6");

	System.out.println(al.getLista());
	al.translateWord("w1");
	
	
	
	
	
	
	
	
	
	
	
	}
}
