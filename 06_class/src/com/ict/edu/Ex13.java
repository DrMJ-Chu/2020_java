package com.ict.edu;

public class Ex13 {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		  지역변수와 전역변수의 변수이름이 같을때 전역변수에 this를 붙여서
	//		  전역변수를 나타낸다.
	
	// this() : 객체의 생성자를 지칭하는 예약어
	//			반드시 생성자의 첫번째 줄에 와야 한다.
	//			생성자에서 다른 생성자를 호출할 때
	
	String name = "고길동";
	int age = 37 ;
	
	// 생성자
	public Ex13() {
	//	System.out.println("기본 생성자 : " + this);
		this("마이콜", 17);
	}
	public Ex13(String name) {
		this.name = name ;
		
	}
	
	public Ex13 (int age) {
		this.age = age ;
	}
	public Ex13(String name, int age) {
		this(24) ;
		this.name = name ;
		this.age = age ;
	}
	
	
	// getter/setter
	public String getName() {	return name;	}
	public void setName(String name) 
	
	{	this.name = name;	}

	public int getAge() {	return age;	}

	public void setAge(int age) {	this.age = age;	}
	
	
}
