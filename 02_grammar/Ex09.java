class Ex09{
	public static void main(String[] args){
		// ��������� : +, -, /, %(������)
	 	// char, ������, �Ǽ��� ��밡��
		int s1 = 9 ;
	 	int s2 = 4 ;
	 	int res = 0 ;

		res = s1 + s2 ;
		System.out.println("��� : " + res) ;


		res = s1 - s2 ;
		System.out.println("��� : " + res) ;


		res = s1 * s2 ;
		System.out.println("��� : " + res) ;


		// ���������� ���� �� ������ ���
		res = s1 / s2 ;
		System.out.println("��� : " + res) ;

		// ���� / ���� = ���� ��, �Ǽ����� ��Ȯ�ϰ� ������ �ʴ´�.
		double result1 = s1 / s2 ;
		System.out.println("��� : " + result1) ;

		// �Ǽ������� ���� ������ ���
		double result2 = (double)(s1) / s2 ;
		System.out.println("��� : " + result1) ;



		res = s1 % s2 ;
		System.out.println("��� : " + res) ;

	}
}