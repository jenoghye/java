package test02;

public class StringTest {

	public static void main(String[] args) {
		String name = "ÀÌÁ¤Çı";
		System.out.println(name.length());// length°¡ nameÀÇ¼ÒÀ¯

		String name2 = new String("ÀÌÁ¤Çı");
		System.out.println(name2.length());

		System.out.println(name);
		System.out.println(name2);
		System.out.println(name == name2);

		String name3 = "ÀÌÁ¤Çı";
		String name4 = ("ÀÌÁ¤Çı");
		System.out.println(name3 == name4);
		
		int a = 3;
		int b = 3;
		System.out.println(a==b);

	}

}
