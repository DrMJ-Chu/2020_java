package com.ict.edu;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : �ڹٿ��� IP�ּҸ� ǥ���ϴ� Ŭ����
//               �����ڰ� ���������� ������� �ʴ´�.
//               6���� static�޼ҵ带 �̿��Ѵ�.
//               ** localhost �� ���� ���� ����ϰ� �ִ� ��ǻ�͸� ���Ѵ�.
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("===============================");

			addr = InetAddress.getByName("www.naver.com");
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("===============================");
			
			// 125.209.222.142
			byte[] b = {125,(byte) 209,(byte) 222,(byte) 142};
			addr = InetAddress.getByAddress(b);
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("===============================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("�̸� : " + k.getHostName());
				System.out.println("�ּ� : " + k.getHostAddress());
				System.out.println("toString() : " + k.toString());
				System.out.println("-----------------");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}









