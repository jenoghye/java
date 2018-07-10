package test05;

public class MyObject {
	static int a = 3; // 1.변수의선언, 2.함수의 선언//int a =3; 하면 에러
	int b = 3; // static 호출방법
	// class는staic임

	void printA() {
		System.out.println(a);
	}

	void setA(int a) {
		this.a = a;//위에 있는 this.a는
	}

	public static void main(String[] args) {
		String str = new String();
		Long l = new Long(3);
		Integer i = new Integer(3);
		Boolean bl = new Boolean(true);
		
		
		System.out.println(a);
		MyObject mo = new MyObject();
		mo.b = 4; // 호출법
		System.out.println(mo.b);
		System.out.println(mo.a);
		mo.setA(20);
		System.out.print(mo.a);
		mo.a = 10;
		mo.printA();
	}
}
