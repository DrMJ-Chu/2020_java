package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// �̸�, ����, ����, ���� ������ �޾Ƽ� 
		// �̸�, ����, ���, ���� ���
		esc:while (true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸� : ");
		String name = sc.next();
		
		System.out.print("���� ���� : ");
		int korean = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int english = sc.nextInt();		
		
		System.out.print("���� ���� : ");
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
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + all);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + hak);
		
		while(true) {
			System.out.println("����ұ��?(1.yes, 2.no) >> ");
			int k = sc.nextInt();
			if(k == 1) {
				continue esc;
			}else if (k == 2) {
				break esc;
			} else {
				System.out.println("����� �Է��ϼ���");			
				continue;
						}
					}	
			
				}
		System.out.println("�����ϼ̽��ϴ�.");		
	}
}

