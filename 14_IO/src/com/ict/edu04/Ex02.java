package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// BufferedWriter : �ӵ����� �ٹٲٱ� �޼ҵ尡 �����Ѵ�.
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// ����
			bw.write(97);
			// ���ڴ�� char
			bw.write('e');
			
			// �迭
			char[] c = {'j','a','v','a'};
			bw.write(c);
			
			// String : �ٹٲٱ� �޼ҵ�=> newLine()
			bw.write("korea");
			bw.newLine();
			bw.write("���ѹα�");
			bw.newLine();
			bw.write("����");
			bw.newLine();
			bw.write("12345");
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}