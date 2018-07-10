package test00;

public class Test1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		if(a!=b) {
			if(a<b){
				System.out.println("a<b");
			}
	//and 연산 = 앞에 두 조건을 한번에 작성>>두조건이 모두 일치해야 실행
		if(a!=b && a<b) {
			System.out.println("a와b다르고 a<b");
		}
	//앞조건 x 뒷조건o => or연산
		if(a==b || a<b) {
			System.out.println("a와b다르고a<b");
		}
		
		
		}
		
	}// |\/
}
