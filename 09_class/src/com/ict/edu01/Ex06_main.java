package com.ict.edu01;

public class Ex06_main {
	public static void main(String[] args) {
		
		// ����Ŭ���� ������ ��ü ���� �ȵ�
		// In_01 in01 = new In_01();
		
		Ex06 e6 = new Ex06();
		System.out.println(e6.name);
		e6.sound();
		System.out.println("-------------");
		
		// 1. ����Ŭ������ �����ϴ� �޼ҵ带 ����
		e6.play();
		// ����Ŭ������ �����ϴ� �޼ҵ� ������ ������ ����Ŭ���� ��� ���� 
		
		// Member ����Ŭ���� ����� ������� ��ü ���� ����
		// Ex06.In_01 in01 = e6.new In_01();
		
		
	}
}
