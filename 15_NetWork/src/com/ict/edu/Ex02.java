package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL(Uniform Resource Locator) Ŭ���� : ���ͳݿ��� ���� ������ �ڿ��� �ּ� 
//									        ������ ���� �ڿ��� ����� �����´�. 
// final Ŭ�����̴�.(��� �ȵ�)              
public class Ex02 {
	public static void main(String[] args) {
		// �ش� ����Ʈ ���� �����б�
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// ����ǻ�Ϳ� ���� ����
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "data01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("https://www.naver.com");
			System.out.println("��������: " + url.getProtocol());
			System.out.println("��Ʈ: " +url.getPort());
			System.out.println("path: " +url.getPath());
			System.out.println("ȣ��Ʈ: " +url.getHost());
			System.out.println("�ȳ�: " +url.getUserInfo());
			System.out.println("==============================");
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				// System.out.println(msg+"\n");
				sb = sb.append(msg+"\n");
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
