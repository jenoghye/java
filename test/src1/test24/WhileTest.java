package test24;

public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		/*while(10>i) {
			System.out.println(i++);
		}*/

		do {
			System.out.println(i++);//우선 실행함
		}while(i>10);
	
	}
}
