package com.demo.art;
import java.util.ArrayList;
public class musem {

	public static void main(String[] args) {
		Painting paint1 = new Painting("Fulham" , "Ahmad" , "Very nice " , "Oil") ; 
//		Painting paint2 = new Painting() ; 
//		Painting paint3 = new Painting() ; 
		Sculpture sc1 = new Sculpture("Barcelona City" , "Saad" , "Cubes bulidings" , "coal");
//		Sculpture sc2 = new Sculpture();
		System.out.println(paint1.getTitle());
		System.out.println(sc1.getMaterial());
		ArrayList<ART> myMusem = new ArrayList<ART> ();
		myMusem.add(paint1);
		myMusem.add(sc1);
		for (ART peice : myMusem) {
			System.out.println("------------------------");
			peice.viewArt();
		}
		
		

	}

}
