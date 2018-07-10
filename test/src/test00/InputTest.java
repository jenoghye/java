package test00;

import java.util.Scanner;

public class InputTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("첫 숫자 입력:");
		int/*double*/ num1 = Integer.parseInt(scan.nextLine());
		System.out.print("2숫자 입력:");
		int num2 = Integer.parseInt(scan.nextLine());//nextline은 enter칠때까지,수를 써서엔터치면 num2에 들어감
		System.out.print("연산자 입력:");//
		String op = scan.nextLine();//<<수가 아니고 연산자를 넣을 것이라String
		System.out.print(num1+" "+op+" "+num2+" "+"="+" ");
	
		//+와 값이 같으니?하고 물음
		if(op.equals("+")) {
			 System.out.println(num1+num2);
		} else if(op.equals("-")) {
			 System.out.println(num1-num2);
		} else if(op.equals("*")) {
			 System.out.println(num1*num2);
		} else if(op.equals("/")) {
			 System.out.println((double)num1/(double)num2);
		}else {
			 System.out.println("잘써");
		}
		
		
		String a = "123";
		String b = "123";
		System.out.println(a==b);
		
		String c = "123"; //string 데이터 타입
		String d = new String("123");//값은 같으나 주소가 다름
		System.out.print(a.equals(b));//string 안에 equals가 있음, 함수
		                              //따라서 a에 속한 equals value값비교
		
		//Integer j
		/*int a = 1;
		String num = "1";
		int b = Integer.parseInt(num);//정해져있는 데이터 타입x 주인, ()가 있어서호출, 기울어져 있어서 static 생성하지 않아도 호출 가능!
		              //문자"1"를 숫자1로 바꿔줌 
		System.out.println(a+b);*/
		
		
	}
}
