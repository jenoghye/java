package test1;

public class Test {

	public int  index(String[] str, String s) {
		for(int i = 0; i<str.length;i++) {
			if(str[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Test t = new Test();
		String[] str = new String[5];
		
		for(int i = 0;i<str.length;i++) {
			str[i] = "���Ź�"+i;
		}
		int rs = t.index(str,"���Ź�0");
		if(rs!=-1) {
			System.out.println("�װŽ�"+rs+"��° �濡 �ִٿ�");
		}else {
			System.out.println("ã�°��̾�����");
		}
		
	}
}
