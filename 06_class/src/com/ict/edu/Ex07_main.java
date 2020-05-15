package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();					// 객체 생성
		
		// 이름과 가격을 출력하자.
		// System.out.println(t1.name);
		// System.out.println(t1.price);
		
		String name = t1.getName();		// getter getName(); 사용
		int price = t1.getPrice();		// getter getPrice(); 사용
		System.out.println(name);
		System.out.println(price);

		// 커피우유를 딸기우유로 변경해서 출력
		t1.setName("딸기우유");			// setter setName(); 사용
		name = t1.getName();			// 변경값을 name에 지정
		System.out.println(name);		// name 출력
		System.out.println("=================");
		
		Ex07 t2 = new Ex07();				// t2 객체 신규 생성
		name = t2.getName();				// 따라서 t1와 객체가 다르며
		System.out.println(name);			// t1에서 setter는 적용되지 않음
		
		
	}
}
