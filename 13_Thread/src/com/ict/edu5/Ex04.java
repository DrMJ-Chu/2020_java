package com.ict.edu5;

// 5. �ΰ��� �����带 �����Ͽ� ù��° ��������  ����� 1~100���� ����ϰ�,
//	    �ι�° �������� ����� 100~200���� ����϶� (syncronize ���)
public class Ex04 implements Runnable{
	int x = 0;
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
		}
		
	}
	
	public static void main(String[] args) {
		Ex04 t = new Ex04();
		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();
		
	}
	

}
