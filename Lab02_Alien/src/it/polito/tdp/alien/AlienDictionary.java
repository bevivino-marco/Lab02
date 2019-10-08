package it.polito.tdp.alien;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class AlienDictionary extends Dictionary{
	private Map <Object, Object> mappaW = new HashMap <Object, Object>();

	@Override
	public Enumeration elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return mappaW.get(arg0);
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
		// TODO Auto-generated method stub
		mappaW.put(arg0, arg1);
		return mappaW.get(arg0);
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
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
