package test05;

public class StaticTest {

	int a = 3;
	static int b = 4;// �ʱ�ȭx  static�����ϸ� �޸� ����x

	public static void main(String[] args) {
		
		
		
		
		StaticTest.b = 3;
		StaticTest st = new StaticTest();
		st.a = 4;
		st.b = 10;
		st = new StaticTest();
		System.out.println(st.a);// �ʱ�ȭ �� 3
		System.out.println(st.b);// new static���� ������ �ʱ�ȭx
	}
}
