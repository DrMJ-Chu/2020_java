package com.ict.edu;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();					// ��ü ����
		
		// �̸��� ������ �������.
		// System.out.println(t1.name);
		// System.out.println(t1.price);
		
		String name = t1.getName();		// getter getName(); ���
		int price = t1.getPrice();		// getter getPrice(); ���
		System.out.println(name);
		System.out.println(price);

		// Ŀ�ǿ����� ��������� �����ؼ� ���
		t1.setName("�������");			// setter setName(); ���
		name = t1.getName();			// ���氪�� name�� ����
		System.out.println(name);		// name ���
		System.out.println("=================");
		
		Ex07 t2 = new Ex07();				// t2 ��ü �ű� ����
		name = t2.getName();				// ���� t1�� ��ü�� �ٸ���
		System.out.println(name);			// t1���� setter�� ������� ����
		
		
	}
}
