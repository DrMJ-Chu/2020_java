package com.ict.edu01;

public class Ex04 {
 // 내부 클래스 : 클래스안에 다른 클래스가 정의 되어 있는 클래스 
 // 종류 : Member, Local, static, Anonymous 
 // 1. Member : 외부클래스{ 멤버필드,생성자, **내부클래스{...},멤버메소드 }
 //    - 내부클래스는 외부클래스의 멤버들을 마음대로 사용 가능(상속비슷)
 //    - 상속에서는 private 멤버 접근 안됨, 내부클래스에서는 private 멤버 접근 가능
 //    - 외부클래스를 통해서 내부클래스를 객체 생성한다.
 //	     (즉, 내부클래스가 별도로 객체 생성을 할 수 없다.)
	
 // 2. Local : 외부클래스 메소드안에 내부클래스가 존재 
 //            외부클래스의 지역변수처럼 사용
 //	           (메소드 실행될때 생성가능, 메소드가 종료 될때 내부클래스도 지워진다.)
 
 // 3. static : Member내부클래스 처럼 외부 클래스 안에 존재하는 클래스 
 // 	       내부클래스의 멤버 변수는 static를 사용할 수 없는데 
 //            어쩔수 없이 내부클래스 멤버 변수에 static를 사용하고자 할때 
 //            내부클래스의 static를 붙인다.
 //            외부클래스{ 멤버필드,생성자, **static 내부클래스{static...},멤버메소드 }
 //            내부클래스 멤버는 일반 static 처럼 사용 하면 된다.
 
 // 4. **Anonymous(익명) : 정의된 클래스의 이름이 없는 클래스 
 //                        다시 호출 할 수 없다. 
 //                        일회용으로 한번 사용하고 다시 사용 할 수 없다.	
	
}
