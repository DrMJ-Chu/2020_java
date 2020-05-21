package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set �������̽��� ������ Ŭ����  : HashSet, TreeSet;
		// Ư¡ : �ߺ��ȵ�, ���ľȵ� (TreeSet�� �׻� ������������)
		
		// �÷��� ����: HashSet<���״�=��üŸ��=Ŭ����> �������� = new HashSet<���״�>() ;
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();
		
		// �ش� �÷��ǿ� ��ü �ֱ�(�Ϲ� ��ü�� ���� �� �־�� �ȴ�.)
		// 1. ��ü�� �����
		Integer k1 = new Integer(10);   // �ڽ�
		Integer k2 = new Integer("20");
		
		// 2. �÷��ǿ� �ֱ�(add)
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50);    // ����ڽ� : �ڷ��� int 50�� �ڵ����� ��ü�� ���� �־��ش�.
		h1.add(60);    // ����ڽ� : �ڷ��� int 60�� �ڵ����� ��ü�� ���� �־��ش�.
		
		// Double �ֱ� 
		Double d1 = new Double(10);
		Double d2 = new Double("20");
		
		h2.add(d1);
		h2.add(d2);
		// h2.add(10); ����ڽ��� ������ �ڷ����� �¾ƾ� ����.
		h2.add(10.0);
		
		h3.add(true);
		h3.add(false);
		h3.add(true); // ������ ���� ������ ���� �ʴ´�.(�ߺ�������� ����)
		
		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a'); // ������ ���� ������ ���� �ʴ´�.(�ߺ�������� ����)
		
		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");
		
		System.out.println("==================");
		System.out.println("��ü���뺸��");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		System.out.println("==================");
		
		System.out.println("�ϳ��� ����<������FOR>");
		for (Integer k : h1) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		// ��ڽ� : ��ü�� �Ϲ������� ����ϴ� �ڷ������� ��ȯ
		for (int k : h1) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println("�ϳ��� ����<iterator>");
		Iterator<Double> it = h2.iterator(); 
		// hasNext() => ���� ��ü�� �����ϸ� true
		while (it.hasNext()) {
			// ������ü�� ������ ���ؼ� �̵��ϰ� ��ȯ�Ѵ�..
			double res = (double) it.next();
			System.out.print(res+"  ");
		}
		System.out.println();
		
		System.out.println("=======================");
		// h4, h5 ���
		for (char k : h4) {
			System.out.print(k+"  ");
		}
		System.out.println();
		System.out.println("=======================");
		
		Iterator<Character> it2 = h4.iterator();
		while (it2.hasNext()) {
			char res = (char) it2.next();
			System.out.print(res+"   ");
		}
		System.out.println();
		System.out.println("=======================");
		
		for (String k : h5) {
			System.out.print(k+"  ");
		}
		System.out.println();
		System.out.println("=======================");
		Iterator<String> it3 = h5.iterator();
		while (it3.hasNext()) {
			String res = (String) it3.next();
			System.out.print(res+"   ");
		}
		System.out.println();
	}
}




















