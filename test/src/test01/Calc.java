package test01;

public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		num1 = 30;

		System.out.println(num1 + num2);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + num1 + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println(num1 == 30);
		System.out.println(num1 != 30);
		System.out.println(num1 > 30);
		System.out.println(num1 >= 30);
		System.out.println(num1 <= 30);

		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("num1 * num2 = " + num1 * num2);
		System.out.println("3 % 2 = " + 3 % 2);
		
		/* System.out.println("20"+"30"); //"����" =>2030 "A=B" ���ٰ� �ƴϰ� A�� B ����! +�� ���ϱ��
		 * ���� cf>System.out.println(num1 == 30); >num1�� 30�̰����� ���� �� >> true
		 * cf2>System.out.println(num1 != 30);>!=���������� �ٸ��� ���� �� >> false cf3>������������..
		 * �Ҽ����� �ȳ��� System.out.println("num1 / num2 = " + num1/num2); >��=1(�� ����)
		 * System.out.println("3 % 2 = " + 3%2); > ��=1(�������� ����)
		 * 
		 */

	}

}
