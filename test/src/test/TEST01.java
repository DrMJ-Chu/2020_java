package test;

public class TEST01 {
	// 1. 자바에서 사용하는 기본자료형를 쓰시오
	// => boolean, char, byte, short, int, long, float, double
	
	// 2. 정수값 10을 su라는 변수에 넣고 변수 su에 데이터가 들어갔는지 확인하는 자바 형식을  쓰시오 
	public static void main(String[] args) {
		
	
		int su = 10;
	System.out.println(su);
	
	System.out.println("==========================");
	
	// 3. a++ 과 ++a 의 차이점을 쓰시오
	
	// a++은 a를 하나씩 올리고 이후 처리한다.
	// ​++a는 먼저 연산하고 그 이후 하나씩 올린다.
	
	// 4. 논리연산자 AND와 OR에 대해서 쓰시오
	
	// AND는 두개의 조건들 중 둘다 TRUE일시 TRUE이다.
	// OR은 두개의 조건들 중 하나가 TURE일시 TRUE이다.
	
	// 5. int su = 24  일때  삼항연산자를 활용해서 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오
	 int su1 = 24;
	 String A = "짝수";
	 String B = "홀수";
	 String C = (su1%2 == 0)?A:B;
	 System.out.println(C);
	}

}