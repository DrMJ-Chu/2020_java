package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// ����, ������, ������ 1byte�� ó���ؾ� �ȴ�. 
		// �д� ��ġ
		String pathname1 
			= "C:"+File.separator+"Study"+File.separator+"util"+File.separator+"����.mp4";
		File file1 = new File(pathname1);
		
		// ���� ��ġ
		String pathname2 
			= "C:"+File.separator+"Study"+File.separator+"����_copy.mp4";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while((b = bis.read())!= -1) {
				bos.write(b);
			}
			bos.flush();
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				if (bos != null) bos.close();
				if (fos != null) bos.close();
				if (bis != null) bos.close();
				if (fis != null) bos.close();
				
				{
					
				}
				
			} catch (Exception e2) {
				
			}
		}
	}

}
