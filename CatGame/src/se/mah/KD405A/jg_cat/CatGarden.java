package se.mah.KD405A.jg_cat;

import java.util.ArrayList;

public class CatGarden {
	
	private ArrayList<Cat> allCats;
	private String name;
	
	public CatGarden (String name){
		allCats = new ArrayList<Cat>();
		this.name = name;
		
	}
	public String getCats(){
		String s = this.name+"\n";
		for(Cat cat:allCats) {
			s=s+ cat.getName() + "\n";
		}
		return s;
	}
	
	public void addCat(Cat c){
		if(allCats.size()<101){
			this.allCats.add(c);
		}
	}
	public void killCat();
		allCats.remove(0);
		

}
