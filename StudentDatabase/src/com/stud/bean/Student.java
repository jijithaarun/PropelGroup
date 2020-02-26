package com.stud.bean;

public class Student {
	//instance variable
   private	int id;
   private	String name;
   private	int english;
   private	int science;
   private	int social;
   private	int maths;
   private	int malayalam;
   private	int total;
//default constructor
   public Student(){
	   
   }

public Student(int id, String name, int english, int science, int social,
		int maths, int malayalam, int total) {
	super();
	this.id = id;
	this.name = name;
	this.english = english;
	this.science = science;
	this.social = social;
	this.maths = maths;
	this.malayalam = malayalam;
	this.total = total;
}
//parameteraised constructor

public Student(String name, int english, int science, int social, int maths,
		int malayalam, int total) {
	super();
	this.name = name;
	this.english = english;
	this.science = science;
	this.social = social;
	this.maths = maths;
	this.malayalam = malayalam;
	this.total = total;
}
//getter n setter

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEnglish() {
	return english;
}

public void setEnglish(int english) {
	this.english = english;
}

public int getScience() {
	return science;
}

public void setScience(int science) {
	this.science = science;
}

public int getSocial() {
	return social;
}

public void setSocial(int social) {
	this.social = social;
}

public int getMaths() {
	return maths;
}

public void setMaths(int maths) {
	this.maths = maths;
}

public int getMalayalam() {
	return malayalam;
}

public void setMalayalam(int malayalam) {
	this.malayalam = malayalam;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}
//to string
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", english=" + english
			+ ", science=" + science + ", social=" + social + ", maths="
			+ maths + ", malayalam=" + malayalam + ", total=" + total + "]";
}
   
   
}
	
