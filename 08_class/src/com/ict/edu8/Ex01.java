package com.ict.edu8;

//	�������̽� : ���񽺸� �����ϴ� ����� ���Ѵ�.
//				 ����� �߻�޼ҵ��� �̷�� ����.
//				 �����ڰ� ����. (��ü ���� �ȵ�)
//				 �����ϰ� ���� ����� �����ϴ�.
//				 ** '�������̽��� ����'��� ���� ��ü�� �����ϴ�.
//				 	 ȣȯ�� �����ϴ�.

public interface Ex01 {
	// ��δ� static final �̴�.
	int su1 = 10 ;
	static int su2 = 20 ;
	final int SU3 = 30 ;
	static final int SU4 = 40 ;
	
	// �߻�޼ҵ尡 �ƴ϶� �����߻�
	// public void play() {}
	
	// �Ϲ����� �߻�޼ҵ�
	public abstract void play() ;
	
	// interface������ abstract ���� ������� �ʾƵ� ������ �ȳ�
	public void sound();
	
}
