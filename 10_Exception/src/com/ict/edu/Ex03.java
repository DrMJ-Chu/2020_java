package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���� catch �� : try���� ���ܹ߻��� ������ �� �� �ִ� ���
// ���� ���� : Exception ����Ҷ��� �ݵ�� �Ʒ� �� catch���� ��� 

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// InputMismatchException
		// ArithmeticException
		/*
		try {
			int var = 50 ;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));
			
		} catch (InputMismatchException e1) {
			System.out.println("������ �Է����ּ��� ");
		} catch (ArithmeticException e2) {
			System.out.println("0���δ� ���� ���� �����ϴ�.");
		}
		*/
		try {
			int var = 50 ;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));
		} catch (Exception e) {
			System.out.println("����� �Է����ּ���.");
		}
		
		
		
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
