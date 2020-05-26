package com.ict.edu;

import java.io.File;

// File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리는 클래스
// 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
//               File(File 상위경로, String 하위경로)
// 주요 메소드 :
// - createNewFile() : 파일 생성하면 true,
// - mkdir(), mkdirs() : 디렉토리 생성
// - delete() : 파일, 디렉토리 삭제
// - isDirectory() : 디렉토리이면 true
// - isFile() : 파일이면 true
// - list() :  특위치의 파일, 디렉토리들을 String[]에 담아 놓는 것
// - length() : 길이가 아니라 파일의 크기를 byte 표시 
// - getAbsolutePath() : 절대경로 표시
// - getCanonicalPath() : 정규화 경로 표시 
// - getPath()    : 상대 경로 표시 

public class Ex01 {
	public static void main(String[] args) {
		// String pathName = "C:\\Study\\util"; // 운영체제가 windows일때
		// String pathName = "C:/Study/util"; //  운영체제가 linux, Unix 일때
		// 운영체제와 상관없이 사용하는 방법
		String pathName = "C:"+File.separator+"Study"+File.separator+"util";
		
		File file = new File(pathName);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathName,k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("디렉토리 : "+ file2 + "   크기가 존재하지 않음");
			}else {
				System.out.println("디렉토리 : "+ file2 + ", 크기 : " + file2.length()+"byte");
			}
		}
		
	}
}
