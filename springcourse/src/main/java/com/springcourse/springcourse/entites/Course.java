package com.springcourse.springcourse.entites;



public class Course {
     private long id;
     private String title;
     private String discrption;
	public Course(long id, String title, String discrption) {
		super();
		this.id = id;
		this.title = title;
		this.discrption = discrption;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscrption() {
		return discrption;
	}
	public void setDiscrption(String discrption) {
		this.discrption = discrption;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discrption=" + discrption + "]";
	}
	
	
}
