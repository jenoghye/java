package test02;

public class ArrayTest {

	public static void main(String[] aegs) {
		int[] arr = new int[3];

		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 7;

		// int[] arr = new int[len];
		// arr[0] = 3;
		// arr[1] = 5;
		// arr[2] = 7;
		//

		// int i = 3;<<�ߺ������� ����
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int i = 3;
		System.out.println(i);
		// int i = 4;<<���� �ߺ� �� ����x

		// arr[3] = 1;
		// arr[4] = 5; //����

		// <<������ �ִ� ��,����
		// �迭�� ���� ���
		// System.out.println(name2.length());cf>length()<<�Լ������� �����

		// for(int i=0/*i=1�ϸ� 3������*/;i<4;i++) {
		// System.out.println(arr[i]);
	}

}
