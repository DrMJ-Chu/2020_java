package com.ict.edu;

import java.util.HashMap;

public class Ex11 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를 매핑하는 구조로 이루어짐
		//                  Key는 중복될 수 없다.
		//  				Key를 호출하면 Value가 나온다.
		//                  Key를 별도로 관리 => keySet()
		//                  add()로 추가 못함
		//                  put(key, value) 추가한다.
		
		
		// Map생성 (key 숫자로 만든다.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 추가 : add X, put(k,v)
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(4, "중국");
		map1.put(9, "태국");
		map1.put(15, "영국");
		map1.put(20, "한국");  // value의 중복은 상관없다.
		map1.put(22, "한국");
		map1.put(4, "영국"); // key 중복 : 덮어쓴다.
		
		System.out.println(map1);
		
		// 하나씩 출력 (get(key) => value가 나온다.) 
		System.out.println(map1.get(4));
		System.out.println(map1.get("한국"));
		System.out.println("================");
		
		// 일부러 key를 순서대로 만들었기 때문에 for문을 사용할 수 있다.
		// map에서 value를 호출하는 방법 ; get(key)
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("=========");
		
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
	}
}










