package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
		Scanner sc = new Scanner(System.in);
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			
		System.out.print("이름을 입력해주세요 >> ");
		String name = sc.next();
		
		System.out.print("국어점수를 입력해주세요 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수를 입력해주세요 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수를 입력해주세요 >> ");
		int math = sc.nextInt();
		
		}
		
		// 총점, 평균, 학점
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
}
	



