package com.demo.art;

public class Sculpture extends ART {
	private String material ; 
	
	public Sculpture(String title, String author, String description,String material) {
		super(title, author ,description);
		this.material= material;
	}

	@Override
	public void viewArt() {
		System.out.println("Great Sculpture");
		System.out.println("Title : " + this.getTitle());
		System.out.println("Author : " + this.getAuthor());
		System.out.println("Descreption : " + this.getDescreption());
		System.out.println("Material Used : " + this.material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	} 
	
	

}
