package com.ict.debugging;

// ����� �Ǵ� ����״� ��ǻ�� ���α׷� ���� �ܰ� �߿� 
// �߻��ϴ� �ý����� ������ ������ �������� ����(����)�� ã�Ƴ��� 
// �� ������ ������ �����ϴ� �۾� ������ ���Ѵ�.

// breakpoint(�ߴ���) : ����� ����� �ڵ����� ������ �ߴܵǾ� �ش� 
//                      ������ ���� ���� �� �� �ִ� Ư�� ������ ���Ѵ�.
public class Ex01 {
	public static void main(String[] args) {
		int total = 0 ;
		for (int i = 1; i < 11; i++) {
			total = total + i ;
			System.out.println("i = " + i +", total = " + total );
		}
		System.out.println("�� : " + total);
	}
}
