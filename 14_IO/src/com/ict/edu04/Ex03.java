package com.ict.edu04;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read() : int(�ƽ�Ű�ڵ�) =>char����ȯ, read(byte[] b), String �̿� 
// FileReader      : read() : int(�����ڵ�) => char����ȯ, read(char[] b), String �̿�
public class Ex03 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// �� ���� �б� : ��� ������ �о�ü� �ִ�.
			// int k =  fr.read();
			// System.out.println(k+":"+(char)(k));
			
			// ��ü �б�
			/*
			int k = 0 ;
			while ((k= fr.read()) != -1) {
				System.out.print((char)(k));
			}
			*/
			
			// char[] 
			/*
			char[] c = new char[(int) file.length()];
			fr.read(c);
			for (char k : c) {
				System.out.print(k);
			}
			*/
			
			// String
			char[] c = new char[(int) file.length()];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
