package com.ict.edu;

public class Ex02 {
	//	멤버필드 : 상태값, 속성, 특징, 데이터
	//	instance 필드 : 객체 생성할 때 같이 생성되는 필드
	//	static 필드 : 객체 생성과 상관없이 먼저 생성되는 필드, static 표시
	//	final이 있으면 => 상수
	//	final이 없으면 => 변수
	
	int kor = 80 ; 		 		// 인스턴스 변수				>>>	final이 붙지 않으면 변수
	static int eng = 85 ;		// static 변수					>>> static이 붙으면 static
	final int math = 90 ;		// 인스턴스 상수				>>> final이 붙으면 상수
	final static int com = 95 ; // static 상수 					>>> 일반적으로 상수를 표현할때 사용
	
	//	변수와 상수의 차이
	//	메소드 : 기능, 동작
	//	메소드 구성 : 접근제한자 메소즈종류 반환형 메소드이름([인자]){실행내용}
	//	void는 되돌아갈때 결과가 없다.
	public void prn() {
		
			// 변수이기 때문에 변경가능
			kor = kor + 10 ;
			eng = eng + 20 ;
			
			// 상수이기 때문에 변경하면 오류 발생
			//	math = math + 10 ;
			//	com = com + 10 ;
	}

}
