package com.ict.edu;

import java.util.Random;

// Random Ŭ������ ��ӹ޾Ƽ� ���
public class Ex03 extends Random{
	public static void main(String[] args) {
		// main �޼ҵ嵵 static�̱� ������ static ���������� �� �����.
		// static int num = nextInt(10)+1; // 1~10
		
		// static �޼ҵ尡 �ƴ϶� ��� �Ұ�
		// int num = nextInt(10)+1; // 1~10
		// system.out.println(num)
		
		// play()�� ����ϱ� ���ؼ��� ���� Ŭ������ ��ü�� ������ �Ѵ�.
		Ex03 e3 = new Ex03();
		e3.play();
		
	}
	
	public void play() {
		int num = nextInt(10)+1; // 1~10
		System.out.println(num);
		
	}

}