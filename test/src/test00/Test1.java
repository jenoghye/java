package test00;

public class Test1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		if(a!=b) {
			if(a<b){
				System.out.println("a<b");
			}
	//and ���� = �տ� �� ������ �ѹ��� �ۼ�>>�������� ��� ��ġ�ؾ� ����
		if(a!=b && a<b) {
			System.out.println("a��b�ٸ��� a<b");
		}
	//������ x ������o => or����
		if(a==b || a<b) {
			System.out.println("a��b�ٸ���a<b");
		}
		
		
		}
		
	}// |\/
}
