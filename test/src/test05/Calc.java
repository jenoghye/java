package test05;

import java.util.Scanner;

class Test {
	static int num = 2;
}

public class Calc {
	static int a = 3;// �Ʒ��� a�� ��� ����

	public static void main(String[] arges) {

		Scanner scan = new Scanner(System.in);//�Է��� ������ scanner
		
		System.out.print("ù��° ���ڸ� �Է����ּ���:");
		String num1Str = scan.nextLine(); //num1Str>>����
		int num1 = Integer.parseInt(num1Str);
		
		System.out.print("�ι�° ���ڸ� �Է����ּ���:");
		String num2Str = scan.nextLine();//nextline>>enter��
		int num2 = Integer.parseInt(num2Str);

		System.out.print("ù����+�ι�° ����:");
		System.out.println(num1 + num2);
		scan.close();
		
		String numStr = "123";
		int num = Integer.parseInt(numStr);
		System.out.println(num);

		System.out.println(a);// ���Ͽ����̶� Calc.a����
		System.out.println(Test.num);
		Calc2 c1 = new Calc2();
		//1.a = 4;
		Calc2 c2 = new Calc2();
		//System.out.println(c2.a);// ����static�̶�� �߱⶧���� ������ ������ ����� ������ a�� ���ϵ�

		//Integer<<���� �빮�ڸ� class
		//Integer.parseInt()<<�Լ������� ���������ʾƵ� �����Ѱ��� static�� ������
		//System.out<<static����  static�� ���ڰ� ��￩��
	}
}
