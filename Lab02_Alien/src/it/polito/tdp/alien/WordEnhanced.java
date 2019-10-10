package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String aW;
	//private String tr;
	private List <String> listaT= new LinkedList <String >();
	
	public WordEnhanced(String aW, String tr) {
		//super();
		this.aW = aW;
		//this.tr= tr;
	}
	public String getaW() {
		return aW;
	}
	
	public String getListaT() {
		return listaT.toString();
	}
	public void setListaT(String traduzione) {
		this.listaT.add(traduzione);
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
