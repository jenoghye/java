package test03;

public class ArrayFor {

	public static void main(String[] args) {
		String[] arr = new String[3];
		for (int i = 0; i < arr.length; i++){
			arr[i] = "�׽�Ʈ~" + (i + 1);
			System.out.println(arr[i].length());
			
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		/*
		 * String str = "abcdefg"; System.out.println(str.length());
		 * 
		 * String[] arrStr = new String[7]; //String �迭=>String ���� ������ ���� !=String
		 * System.out.println(arrStr.length); arrStr[0] = str;
		 * System.out.println(arrStr[0].length());
		 * 
		 * 
		 * String[] arrStr = new String[5]; // �迭����,
		 * ��5������-System.out.println(arrStr[0]);->null��
		 * 
		 * for (int i = 0; i < arrStr.length; i++) { arrStr[i] = "�׽�Ʈ" + 1;
		 * System.out.println(arrStr[i].length()); }
		 * 
		 * String str2 = "abc"; // ������ String str = new String("abc"); // ���� ���� �迭
		 * -���������� Ÿ�Ը�
		 */
	}

}
