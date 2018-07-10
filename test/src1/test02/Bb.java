package test02;

public class Bb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrStr1 = new String[5];
		arrStr1[0] = "a";
		arrStr1[1] = "b";
		arrStr1[2] = "c";
		arrStr1[3] = "d";
		arrStr1[4] = "e";

		for (int i = 0; i < arrStr1.length; i++) {
			System.out.print(arrStr1[i]);
		}

		
		String str = "a,b,c,d,e";
		String[] arrStr = str.split(",");// split구분자 , String[]arrStr>은 string 배열변수 str이 바뀐것이 아니라 str이가지고 있던 것으로 배열변수를
				// 만들은 것임// 방에 순서대로 넣어줌
		for (int i = 0; i < arrStr.length; i++) {//
			System.out.println(arrStr[i]);

		}
	}

}
