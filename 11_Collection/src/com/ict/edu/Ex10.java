package com.ict.edu;

import java.util.LinkedList;

public class Ex10 {
	public static void main(String[] args) {
		// Queue(ť) �������̽� : FIFO(First-In-First-Out)=>�������� ������ ���� ����
		// ���� Ŭ���� : LinkedList 
		LinkedList<String> list = new LinkedList<String>();
		
		// �߰�, ���� : add, addFirst, addLast, offer, offerFirst, offerLast
		list.add("���浿");
		list.offer("�����");
		list.addFirst("�Ѹ�");
		list.offerFirst("����");
		list.addLast("�Ѹ�");
		list.offerLast("����");
		System.out.println(list);
		System.out.println("==========");
		
		// �˻�
		if(list.contains("�Ѹ�")) {
			System.out.println(list.indexOf("�Ѹ�")+"��° ��ġ");
			System.out.println(list.lastIndexOf("�Ѹ�")+"��° ��ġ");
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.get(list.indexOf("�Ѹ�")));
		}
		
		// ���� : remove(Object),remove(index),removeFirst(), removeLast();
		list.removeFirst();
		list.remove("�Ѹ�");
		list.remove(2);
		list.removeLast();
		
		System.out.println(list);
		
		// ���
		for (String k : list) {
			System.out.println(k);
		}
		
	}
}








