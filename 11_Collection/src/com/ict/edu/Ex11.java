package com.ict.edu;

import java.util.HashMap;

public class Ex11 {
	public static void main(String[] args) {
		// Map �������̽� : Key�� Value�� �����ϴ� ������ �̷����
		//                  Key�� �ߺ��� �� ����.
		//  				Key�� ȣ���ϸ� Value�� ���´�.
		//                  Key�� ������ ���� => keySet()
		//                  add()�� �߰� ����
		//                  put(key, value) �߰��Ѵ�.
		
		
		// Map���� (key ���ڷ� �����.)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// �߰� : add X, put(k,v)
		map1.put(0, "�ѱ�");
		map1.put(1, "�̱�");
		map1.put(4, "�߱�");
		map1.put(9, "�±�");
		map1.put(15, "����");
		map1.put(20, "�ѱ�");  // value�� �ߺ��� �������.
		map1.put(22, "�ѱ�");
		map1.put(4, "����"); // key �ߺ� : �����.
		
		System.out.println(map1);
		
		// �ϳ��� ��� (get(key) => value�� ���´�.) 
		System.out.println(map1.get(4));
		System.out.println(map1.get("�ѱ�"));
		System.out.println("================");
		
		// �Ϻη� key�� ������� ������� ������ for���� ����� �� �ִ�.
		// map���� value�� ȣ���ϴ� ��� ; get(key)
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("=========");
		
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
	}
}










