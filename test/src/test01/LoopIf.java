package test01;

public class LoopIf {

	public static void main(String[] args) {
		String numStr = "1";
		int num = Integer.parseInt(numStr);
		System.out.println(num);
		// ���� 1, 1, 11 < ���� 1�� ���ڷ� ��ȯ�Ǿ� �����δ� num�� ���ڰ� ��>

		num++;
		System.out.println(num);

		num = num + 10;
		System.out.println(num);
		//num++  <=>  num = num +1;
		num += 10;
		System.out.println(num);

		if (num == 22) {
			System.out.println("22����");
		} else if (num > 22) {
			System.out.println("22����ŭ");
		} else {
			System.out.print("22�ƴ�");
		}

		

		// for (��������<�ѹ��� ����>; ����; ������)
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// System.out.println(i);//�����x for���ȿ��� ����Ǿ

		// ¦������
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
