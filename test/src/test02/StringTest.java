package test02;

public class StringTest {

	public static void main(String[] args) {
		String name = "������";
		System.out.println(name.length());// length�� name�Ǽ���

		String name2 = new String("������");
		System.out.println(name2.length());

		System.out.println(name);
		System.out.println(name2);
		System.out.println(name == name2);

		String name3 = "������";
		String name4 = ("������");
		System.out.println(name3 == name4);
		
		int a = 3;
		int b = 3;
		System.out.println(a==b);

	}

}
