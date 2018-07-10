package test04;

public class ClassTest {
	int num = 3;
	int getNum() {
		int num = 10;
		return num;
	}
	//변수의선언과 함수의선언만가능
	public static void main(String[]args) {
		ClassTest ct = new ClassTest();
		System.out.println(ct.num);
		int num = ct.getNum();
	}
}
//{}<<선언 {}x>>호출