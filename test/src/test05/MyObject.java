package test05;

public class MyObject {
	static int a = 3; // 1.�����Ǽ���, 2.�Լ��� ����//int a =3; �ϸ� ����
	int b = 3; // static ȣ����
	// class��staic��

	void printA() {
		System.out.println(a);
	}

	void setA(int a) {
		this.a = a;//���� �ִ� this.a��
	}

	public static void main(String[] args) {
		String str = new String();
		Long l = new Long(3);
		Integer i = new Integer(3);
		Boolean bl = new Boolean(true);
		
		
		System.out.println(a);
		MyObject mo = new MyObject();
		mo.b = 4; // ȣ���
		System.out.println(mo.b);
		System.out.println(mo.a);
		mo.setA(20);
		System.out.print(mo.a);
		mo.a = 10;
		mo.printA();
	}
}
