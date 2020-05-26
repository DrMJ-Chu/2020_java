package com.ict.edu6;

public class Producer implements Runnable{
	private Car car;
	
	public Producer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			// �ڵ��� ����
			carName = car.getCat();
			// �ڵ��� â���� �ֱ� 
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}