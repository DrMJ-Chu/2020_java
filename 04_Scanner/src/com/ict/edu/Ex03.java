package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �ݺ�Ƚ�� : ");
		int su = sc.nextInt();
		
		System.out.print("���ϴ� �ܾ� : ");
		String str = sc.next();
		
		for (int i = 0; i < su; i++) {
			System.out.println(str);
		}
		
		
	}
}