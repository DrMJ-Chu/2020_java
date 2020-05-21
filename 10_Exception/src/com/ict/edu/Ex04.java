package com.ict.edu;

import java.util.Scanner;

// throws : ��������, ���� �絵
//   - ���ܰ� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ 
//     ���ܰ�ü�� �����Ѵ�.
//   - ���߿��� ����ó��(try~catch~)�� �ϴ� ���� ����.

public class Ex04 {
	public void setData(String msg) throws NumberFormatException{
		/*
		try {
			// ������ msg�� ���� ������ 
			if(msg.length()>=1) {
				// msg�� ù��° �ڸ��� �����͸� str�� �����ض�  
				String str = msg.substring(0, 1);
				// �ٸ� �޼ҵ� 
				prnData(str);
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ��� ");
		}
		*/
		
		// ������ msg�� ���� ������ 
		if(msg.length()>=1) {
		  // msg�� ù��° �ڸ��� �����͸� str�� �����ض�  
		   String str = msg.substring(0, 1);
		  // �ٸ� �޼ҵ� 
		   prnData(str);
		}
	}
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
		System.out.println(dan + "��");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + " * " + i + "=" + (dan*i));
		}
	}
	
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("������ �Է��ϼ��� >> ") ;
			String msg = sc.next(); //  1 => "1"
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���");
		}
		
	}
}
