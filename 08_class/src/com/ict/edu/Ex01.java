package com.ict.edu;

public class Ex01 {
	// - ��Ӱ��� : �ڽ�Ŭ������ �θ� Ŭ������ ����ʵ�, ����޼ҵ带 ��ü ��������
	//            ������� ��� �� �� �ִ� Ŭ�������� ���踦 ���Ѵ�.
	//            �ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ´�.
	//            �ڽ�Ŭ���� extends �θ�Ŭ����
	// - �ڹٿ����� ���� ��Ӹ� �� �� ����. �� �θ�Ŭ������ �ϳ��� �����Ѵ�.
	// - ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�.
	
	public static void main(String[] args) {
		
		Ex01_sub test = new Ex01_sub();
		// �ڽ� Ŭ������ ȣ��
		// > �θ�Ŭ���� ���� �� �ڽ� Ŭ���� ����
		// > �θ�.�ڽ��� Ŭ���� �ּҰ� �Ȱ���
		// > ������ �켱 ���� : ���� ���� > ���� ���� < �θ� Ŭ����
		System.out.println(test);
		System.out.println("=============");
		test.play();
		
		// �θ�Ŭ������ �޼ҵ� ��밡��
		test.prn1();
		
		// static�� ��Ӱ� ������� ��� ����
		System.out.println(Ex01_sup.car);
		System.out.println(Ex01_sup.GENDER);
		Ex01_sup.prn2();
		
		// private�� ����̾ ���� �ȵ�
		// System.out.println(test.dog);
		
	}
	
}