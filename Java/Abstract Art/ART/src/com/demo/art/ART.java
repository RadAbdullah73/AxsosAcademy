package com.demo.art;

public abstract class ART {
	private String title ;
	private String author ;
	private String descreption ;
	public abstract void viewArt();
	public ART(String title , String author , String descreption) {
		this.title= title ;
		this.author=author;
		this.descreption=descreption;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	

}
