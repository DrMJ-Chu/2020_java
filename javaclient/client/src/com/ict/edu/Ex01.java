package com.ict.edu;

import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("203.236.220.55",7777);
			System.out.println("서버가 연결되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}try {
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
