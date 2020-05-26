package com.ict.edu6;

import java.util.ArrayList;
import java.util.List;

// �ڵ��� ���� ����
public class Car {
	
	// �ڵ��� â��
	private List<String> carList = null;
	
	public Car() {
		carList = new ArrayList<String>();
	}
	
	// �������� �ڵ��� �����ϱ� 
	public String getCat() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0: carName="SM5" ; break;
			case 1: carName="�ű׳ʽ�"; break;
			case 2: carName="ī����"; break;
		}
		return carName;
	}
	
	// �Һ��ڰ� �ڵ����� ��� �޼ҵ� 
	public synchronized String pop() {
		String carName = null;
		
		// �ڵ��� â�� ����� ���� �� �Ǹ����� ����
		if(carList.size() == 0) {
			System.out.println("���� �����. �����Ҷ� ���� ��ٸ�����");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ����� ���� ���� ���� ���߿� �� ���� ����(�Ǹ�)
		carName = carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�. �Ǹ��� ���� " + carName+"\n");
		return carName ;
	}
	
	// �ڵ��� â���� �� �ֱ� 
	public synchronized void push(String car) {
		// ���� car�� �ڵ��� â��(carList)�� �ֱ� 
		carList.add(car);
		System.out.println("�ڵ����� ����� â�� ���� �� �̸� : " + car);
		
		// ����� ���� �� wait()�� ������ �ٽ� �����Ű�� 
		if(carList.size() == 5) {
			notify();
		}
		
	}
}










