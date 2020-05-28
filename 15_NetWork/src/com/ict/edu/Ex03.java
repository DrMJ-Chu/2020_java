package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection Ŭ���� : ������ ������ �ڿ��� ����� ���� ������ ��� �������� �����ü� �ִ�.
public class Ex03 {
	public static void main(String[] args) {
      // InputStreamReader isr = null;
      BufferedReader br = null;
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			System.out.println("���ڵ� : " + conn.getContentEncoding());
			System.out.println("���� : " + conn.getContentLength());
			System.out.println("����Ÿ�� : " + conn.getContentType());
			
			// ���ͳ� ������ ����� �ٵ�� ��������.
			// ��� ������ ������ �� �������� �ؼ��ϰ� �����Ѵ�.
			// ��� ���� ���� ���
			Map<String, List<String>>  list = conn.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println( k +":" + list.get(k));
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				// isr.close();
			} catch (Exception e2) {
			}
		}
	}
}
