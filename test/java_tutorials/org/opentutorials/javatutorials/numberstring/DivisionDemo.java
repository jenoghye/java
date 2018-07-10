package org.opentutorials.javatutorials.numberstring;

public class DivisionDemo {
	public static void main(String[]args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 정수/정수 소수점 이하는 누락
		System.out.println(c/d); // 실수/실수  결과값이 실수로 출력
		System.out.println(a/d); // 정수/실수  정수가 실수로 자동 형변환 결과값이 실수
	}
}
