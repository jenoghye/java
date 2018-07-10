package test00;

public class Test2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {// for문(변수선언;<<실행1번 후 i++에 대입
			System.out.println(i);

			int num = 1;// 변수 선언 시 datatype이 가장 중요 >>가질수 있는 타입이나 범위가 결정
			// datatype 변수명 대입 num에 1대입 값이 변경될 수 있기때문에 변수임!>>바라보고 있는 값이 변함<->상수>>가질수 있는 값이
			// 불변
			num = 3;
			num = 10;

		
			num = 3 + 2;
			num = num + 1;//내 자신한테 1을 더한 것을 대입
			// final int num2 = 3; num2 = 4;<<오류
			num++;//자신한테 +1
			num--;//자신한테-1
			//단항 연산자, 증감연상자.....
			num = num + 10; num +=10; num -=10;
		}

	}
}
