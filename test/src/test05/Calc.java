package test05;

import java.util.Scanner;

class Test {
	static int num = 2;
}

public class Calc {
	static int a = 3;// 아래의 a는 모두 동일

	public static void main(String[] arges) {

		Scanner scan = new Scanner(System.in);//입력을 받은게 scanner
		
		System.out.print("첫번째 숫자를 입력해주세요:");
		String num1Str = scan.nextLine(); //num1Str>>문자
		int num1 = Integer.parseInt(num1Str);
		
		System.out.print("두번째 숫자를 입력해주세요:");
		String num2Str = scan.nextLine();//nextline>>enter값
		int num2 = Integer.parseInt(num2Str);

		System.out.print("첫숫자+두번째 숫자:");
		System.out.println(num1 + num2);
		scan.close();
		
		String numStr = "123";
		int num = Integer.parseInt(numStr);
		System.out.println(num);

		System.out.println(a);// 동일영역이라 Calc.a생략
		System.out.println(Test.num);
		Calc2 c1 = new Calc2();
		//1.a = 4;
		Calc2 c2 = new Calc2();
		//System.out.println(c2.a);// 위에static이라고 했기때문에 무조건 마지막 선언된 값으로 a가 통일됨

		//Integer<<앞이 대문자면 class
		//Integer.parseInt()<<함수이지만 생성하지않아도 가능한것은 static이 생략됨
		//System.out<<static변수  static은 글자가 기울여짐
	}
}
