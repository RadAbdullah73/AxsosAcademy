package com.demo.art;

public class Painting extends ART {
	private String paintType ;

	@Override
	public void viewArt() {
		System.out.println("Great Paintinnng");
		System.out.println("Title : " + this.getTitle());
		System.out.println("Author : " + this.getAuthor());
		System.out.println("Descreption : " + this.getDescreption());
		System.out.println("PaintType : " + this.paintType);
	}
	public Painting(String title, String author, String description,String paintType) {
		super(title, author ,description);
		this.paintType= paintType;

}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
}
