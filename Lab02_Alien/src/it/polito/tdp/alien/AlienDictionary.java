package it.polito.tdp.alien;

import java.util.Dictionary;
import java.util.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlienDictionary extends Dictionary{
	//private Map <Object, Object> mappaW = new HashMap <Object, Object>();
	private List <Word> dizionario = new LinkedList<Word>();

	@Override
	public Enumeration elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		
		for ( Word w : dizionario) {
			if (w.getAlienW().equals(arg0)) {
				return w;
			}
			
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Enumeration keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
         boolean trovato = false;
        	 for (Word w : dizionario) {
                 if (w.getAlienW().equals(arg0)) {
                	 w.setTraduzioni((String)arg1);
                	 trovato = true;
                 }

        	 }
        	 if (trovato ==false) {
        		 
        	 
        		 Word w = new Word ((String)arg0);
        		 dizionario.add(w);
        		 w.setTraduzioni((String)arg1);
        	 }
        	 return arg1;
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		dizionario.remove(arg0);
		return arg0;
	}
	public void clear () {
		dizionario.clear();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*private Map <String, String> mappaW = new HashMap <String, String>();
	
	public Map<String, String> getDictionary() {
		return mappaW;
	}
    public void addWords (String a, String t) {
    	mappaW.put(a, t);
    }
    public String resource(String a) {
    	try {
    		mappaW.containsKey(a);
    		return mappaW.get(a);
           
    	}catch (Exception e) {
    		return "La parola inserita non è nel dizionario";
    	}
    }*/
}
