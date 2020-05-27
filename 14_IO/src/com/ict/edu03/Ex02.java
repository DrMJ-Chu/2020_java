package com.ict.edu03;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream�� ��� �ڷ����� ����� �� �ִ�.
// ������ ȭ���̳� ���Ͽ� ����Ѵ�. (�������)
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io05.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			// ȭ�鿡 ���
			System.out.println(true);
			System.out.print(10);
			System.out.print(24.1);
			System.out.println('c');
			System.out.println("Hello");
			System.out.println("���ѹα�");
			
			// ���Ͽ� ���
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println(true);
			ps.print(10);
			ps.print(24.1);
			ps.println('c');
			ps.println("Hello");
			ps.println("���ѹα�");
			ps.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
