package test03;

public class ArrayFor {

	public static void main(String[] args) {
		String[] arr = new String[3];
		for (int i = 0; i < arr.length; i++){
			arr[i] = "테스트~" + (i + 1);
			System.out.println(arr[i].length());
			
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		/*
		 * String str = "abcdefg"; System.out.println(str.length());
		 * 
		 * String[] arrStr = new String[7]; //String 배열=>String 으로 구성된 모임 !=String
		 * System.out.println(arrStr.length); arrStr[0] = str;
		 * System.out.println(arrStr[0].length());
		 * 
		 * 
		 * String[] arrStr = new String[5]; // 배열선언,
		 * 방5개생성-System.out.println(arrStr[0]);->null값
		 * 
		 * for (int i = 0; i < arrStr.length; i++) { arrStr[i] = "테스트" + 1;
		 * System.out.println(arrStr[i].length()); }
		 * 
		 * String str2 = "abc"; // 꺼내옴 String str = new String("abc"); // 새로 생성 배열
		 * -같은데이터 타입만
		 */
	}

}
