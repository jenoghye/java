package test00;

import java.util.Scanner;

public class InputTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("ù ���� �Է�:");
		int/*double*/ num1 = Integer.parseInt(scan.nextLine());
		System.out.print("2���� �Է�:");
		int num2 = Integer.parseInt(scan.nextLine());//nextline�� enterĥ������,���� �Ἥ����ġ�� num2�� ��
		System.out.print("������ �Է�:");//
		String op = scan.nextLine();//<<���� �ƴϰ� �����ڸ� ���� ���̶�String
		System.out.print(num1+" "+op+" "+num2+" "+"="+" ");
	
		//+�� ���� ������?�ϰ� ����
		if(op.equals("+")) {
			 System.out.println(num1+num2);
		} else if(op.equals("-")) {
			 System.out.println(num1-num2);
		} else if(op.equals("*")) {
			 System.out.println(num1*num2);
		} else if(op.equals("/")) {
			 System.out.println((double)num1/(double)num2);
		}else {
			 System.out.println("�߽�");
		}
		
		
		String a = "123";
		String b = "123";
		System.out.println(a==b);
		
		String c = "123"; //string ������ Ÿ��
		String d = new String("123");//���� ������ �ּҰ� �ٸ�
		System.out.print(a.equals(b));//string �ȿ� equals�� ����, �Լ�
		                              //���� a�� ���� equals value����
		
		//Integer j
		/*int a = 1;
		String num = "1";
		int b = Integer.parseInt(num);//�������ִ� ������ Ÿ��x ����, ()�� �־ȣ��, ������ �־ static �������� �ʾƵ� ȣ�� ����!
		              //����"1"�� ����1�� �ٲ��� 
		System.out.println(a+b);*/
		
		
	}
}
