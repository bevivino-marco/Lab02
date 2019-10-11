package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String aW;
	
	private List <String> listaT= new LinkedList <String >();
	
	
	/*public WordEnhanced(String aW, String tr) {

		this.aW = aW;
		this.listaT.add(tr);
		//this.tr= tr;
	}*/
	public WordEnhanced(String aW) {
		
		this.aW= aW;
			
		
		
	}
	public String getaW() {
		return aW;
	}
	
	public void setTraduzioni(String trad) {

	 if (!listaT.contains(trad))
		 listaT.add(trad);
	}
	public boolean compareWild(String wild) {
		if (aW.matches(wild))
			return true;
		return false;
	}
	
	public String getTraduzioni() {
		String tr = "";
		for (String a : listaT) {
			
			tr = a+"\n";
		}
		return tr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aW == null) ? 0 : aW.hashCode());
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
		WordEnhanced other = (WordEnhanced) obj;
		if (aW == null) {
			if (other.aW != null)
				return false;
		} else if (!aW.equals(other.aW))
			return false;
		return true;
	}
	
	 
	

}
