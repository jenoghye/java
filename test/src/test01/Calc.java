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
		
		/* System.out.println("20"+"30"); //"문자" =>2030 "A=B" 같다가 아니고 A에 B 대입! +는 더하기와
		 * 연결 cf>System.out.println(num1 == 30); >num1과 30이같은지 물음 값 >> true
		 * cf2>System.out.println(num1 != 30);>!=부정연산자 다른지 물음 값 >> false cf3>나머지연산자..
		 * 소숫점이 안나옴 System.out.println("num1 / num2 = " + num1/num2); >값=1(몫만 나옴)
		 * System.out.println("3 % 2 = " + 3%2); > 값=1(나머지만 나옴)
		 * 
		 */

	}

}
