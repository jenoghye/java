package practice;
//매개 변수 스트링 배열 arrStr, private int변수 초기화
//생성자 매개변수 int
//매서드 
public class ListTest {
	public String[] arrStr;
	private int idx = 0;
	
	ListTest(int length){
		arrStr = new String[length];
	}
	
	public boolean add(String str) {
		if(idx==arrStr.length) {
			System.out.println("초과");
			return false;
		}
		this.arrStr[idx] = str;
		idx++;
		return true;
	}
}
