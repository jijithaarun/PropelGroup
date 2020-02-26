package com.stud.bean;

public class Student {
	//instance variable
	int id;
	String name;
	int english;
	int science;
	int social;
	int maths;
	int malayalum;
	

	// default constructor
	public Student() {

	}
	
	public Student(String name, int english, int science, int social, int maths,
			int malayalum) {
		super();
		this.name = name;
		this.english = english;
		this.science = science;
		this.social = social;
		this.maths = maths;
		this.malayalum = malayalum;
	}

	//parameteraised constructor


	public Student(int id, String name, int english, int science, int social,
			int maths, int malayalum) {
		super();
		this.id = id;
		this.name = name;
		this.english = english;
		this.science = science;
		this.social = social;
		this.maths = maths;
		this.malayalum = malayalum;
	}

    //using getter and setter
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


	public int getMalayalum() {
		return malayalum;
	}


	public void setMalayalum(int malayalum) {
		this.malayalum = malayalum;
	}
	//generate to string


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", english=" + english
				+ ", science=" + science + ", hindi=" + social + ", maths="
				+ maths + ", malayalum=" + malayalum + "]";
	}
	
}
	