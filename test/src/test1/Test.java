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
			str[i] = "보거미"+i;
		}
		int rs = t.index(str,"보거미0");
		if(rs!=-1) {
			System.out.println("그거슨"+rs+"번째 방에 있다용");
		}else {
			System.out.println("찾는것이엄서영");
		}
		
	}
}
