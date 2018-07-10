package test00;

public class Practice {
	public static void main(String[] args) {
		int i = 3;
		for (int b = 1; b <= 5; b++) {
			if (b == 2) {
				int c = 3;
			}else {
				
				int c = 2;//서로 다른 영역이라서 사용 가능
				//else에서 사용가능 변수 i, b두 개 뿐
				if(b==3) {
					//c 사용가능 선언 불가
				}else {
					
				}
			}
		}
	}

}
