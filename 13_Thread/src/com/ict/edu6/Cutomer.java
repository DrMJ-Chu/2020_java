package com.ict.edu6;

// �Һ���
public class Cutomer implements Runnable{
	private Car car ;

	public Cutomer(Car car) {
	// �����ڿ��� ���� ���ڸ� ���������� ���� 
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
