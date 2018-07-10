package test01;

public class LoopIf {

	public static void main(String[] args) {
		String numStr = "1";
		int num = Integer.parseInt(numStr);
		System.out.println(num);
		// 문자 1, 1, 11 < 문자 1이 숫자로 변환되어 앞으로는 num은 숫자가 됨>

		num++;
		System.out.println(num);

		num = num + 10;
		System.out.println(num);
		//num++  <=>  num = num +1;
		num += 10;
		System.out.println(num);

		if (num == 22) {
			System.out.println("22맞음");
		} else if (num > 22) {
			System.out.println("22보다큼");
		} else {
			System.out.print("22아님");
		}

		

		// for (변수선언<한번만 실행>; 조건; 증감식)
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// System.out.println(i);//값출력x for문안에서 선언되어서

		// 짝수선언
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
