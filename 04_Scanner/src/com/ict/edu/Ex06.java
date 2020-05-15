package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 정보를 받아서 
		// 이름, 총점, 평균, 학점 출력
		esc:while (true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름 : ");
		String name = sc.next();
		
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();		
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int all = (korean+english+math);
		double avg = (int)(all/3.0*10)/10.0;
		String hak = "" ;
		

		if (avg>=90) {
			hak = "A";
		} else if (avg>=80) {
			hak = "B";	
		} else if (avg>=70) {
			hak = "C";
		} else if (avg>=60) {
			hak = "D";
		} else {
			hak = "F";
		}			
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + all);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		
		while(true) {
			System.out.println("계속할까요?(1.yes, 2.no) >> ");
			int k = sc.nextInt();
			if(k == 1) {
				continue esc;
			}else if (k == 2) {
				break esc;
			} else {
				System.out.println("제대로 입력하세요");			
				continue;
						}
					}	
			
				}
		System.out.println("수고하셨습니다.");		
	}
}

