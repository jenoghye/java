package practice;
//�Ű� ���� ��Ʈ�� �迭 arrStr, private int���� �ʱ�ȭ
//������ �Ű����� int
//�ż��� 
public class ListTest {
	public String[] arrStr;
	private int idx = 0;
	
	ListTest(int length){
		arrStr = new String[length];
	}
	
	public boolean add(String str) {
		if(idx==arrStr.length) {
			System.out.println("�ʰ�");
			return false;
		}
		this.arrStr[idx] = str;
		idx++;
		return true;
	}
}
