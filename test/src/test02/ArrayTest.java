package test02;

public class ArrayTest {

	public static void main(String[] aegs) {
		int[] arr = new int[3];

		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 7;

		// int[] arr = new int[len];
		// arr[0] = 3;
		// arr[1] = 5;
		// arr[2] = 7;
		//

		// int i = 3;<<중복값지정 오류
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int i = 3;
		System.out.println(i);
		// int i = 4;<<오류 중복 값 지정x

		// arr[3] = 1;
		// arr[4] = 5; //오류

		// <<가지고 있는 값,변수
		// 배열의 길이 물어봄
		// System.out.println(name2.length());cf>length()<<함수실행후 결과값

		// for(int i=0/*i=1하면 3개나옴*/;i<4;i++) {
		// System.out.println(arr[i]);
	}

}
