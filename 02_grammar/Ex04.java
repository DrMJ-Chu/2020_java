class Ex04{
	public static void main(String[] args){
	  // ���� :  ������ : byte < short < int < long
	  // ������ : byte < short < int < long
	  // �������� �⺻�� int

	  // �Ǽ��� : float < double
	  // �Ǽ����� �⺻�� double

	    // byte : ������ �� ���� ���� ���� ( -128 ~ 127 )
	    //         -128 ~ 127 ������ ���ڸ� ���� ����

	    byte b1 = 127 ;
	    System.out.println(b1);

	    // ������ ����� ����ȴ�.
	    byte b2 = 15 + 20 ;
	    System.out.println(b2);

	    // short : -32768 ~ 32767������ ���� ����
	      short s1 = -32768;
	      System.out.println(s1);

	      short s2 = -32767;
	      System.out.println(s2);

	    // int�� long�� ���� ������ �ܿ� �ʿ䰡 ����.
	    // ������ �Ϲ����� ������ int ���
	    // ���� ū ������ ����� �� long ���
	    int su1 = 247 ;
	    int su2 = 777777 ;
	    System.out.println(su1);
	    System.out.println(su2);

	    // long : int���� �� ���� ������ ������ ����
	    //        �⺻������ ���� �ڿ� L �Ǵ� l �� ���δ�. (��������)
	    long num1 = 124L;
	    System.out.println(num1);

	    // ���� �ڷ����� ū �ڷ����� ����Ǵ� ���� ������ ���� �ʴ´�.
	    long num2 = 124;
	    System.out.println(num2);

	    // ���� su1�� long sum3�� ����
	    long num3 = su1;
	    System.out.println(num3);

	    // short s1�� long sum4�� ����
	    long num4 = s1;
	    System.out.println(num4);


	    // short s1�� long su3�� ����
	    long su3 = s1;
	    System.out.println(su3);

	    char c1 = '��';
	    System.out.println(c1);

	    int su4 = c1 ;
	    System.out.println(su4);
	}
}