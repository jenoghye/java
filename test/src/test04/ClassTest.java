package test04;

public class ClassTest {
	int num = 3;
	int getNum() {
		int num = 10;
		return num;
	}
	//�����Ǽ���� �Լ��Ǽ��𸸰���
	public static void main(String[]args) {
		ClassTest ct = new ClassTest();
		System.out.println(ct.num);
		int num = ct.getNum();
	}
}
//{}<<���� {}x>>ȣ��