package test03;

public class DataType {

	public static void main(String[] args) {
		boolean bl = true;
		System.out.println(bl);
		System.out.println(1 == 1);// datatype������ bl�� ����
		System.out.println(3 == 4);
		bl = 1 == 1;
		System.out.println(bl);

		int a = 3;
		int v = 4;
		bl = a != v;
		if (a != v) {
			System.out.println("a�� v�� ���� �ٸ�");
		} else {
			System.out.println("a��v�ǰ�����");
		}
		if (bl) {
			System.out.println("a�� v�� ���� �ٸ�");
		} else {
			System.out.println("a��v�ǰ�����");
		}

		boolean bl1 = true;
		bl1 = 3 != 3;//bl1�� 3!=3�� �ٸ��� ���� ���� ����
		if(bl1) {
			System.out.println(bl1+"�� ����");
		}else {
			System.out.println(bl1+"�� �ٸ�");
		}

	}

}
// bl>>�񱳿�����!���� //if������ ������ Ÿ���� bl�ϰ�� true or false
