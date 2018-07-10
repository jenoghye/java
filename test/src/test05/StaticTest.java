package test05;

public class StaticTest {

	int a = 3;
	static int b = 4;// 초기화x  static선언하면 메모리 생성x

	public static void main(String[] args) {
		
		
		
		
		StaticTest.b = 3;
		StaticTest st = new StaticTest();
		st.a = 4;
		st.b = 10;
		st = new StaticTest();
		System.out.println(st.a);// 초기화 후 3
		System.out.println(st.b);// new static과는 별도로 초기화x
	}
}
