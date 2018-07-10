package test03;

public class BooleanType {

	public static void main(String[] args) {
		/*
		 * boolean bl1 = 3 == 3; System.out.println("3==3 : " + bl1);
		 * 
		 * boolean bl2 = 20 > 11; System.out.println("20>11 : " + bl2); boolean bl3 = 15
		 * < 5; System.out.println("15<5 : " + bl3); boolean bl4 = 2 != 2;
		 * System.out.println("2!=2 : " + bl4); boolean bl5 = !bl1;
		 * System.out.println("!bl1 : " + bl5);
		 * 
		 * if (bl1) { System.out.println("bl1은참"); } else {
		 * System.out.println("bl1은거짓"); } for (int i = 2; i <= 10; i += 2) {
		 * System.out.println(i); }
		 * 
		 * for (int i = 1; i <= 5; i++) { System.out.print(i); if (i != 5) {
		 * System.out.print(","); } }
		 */

		for (int i = 0; i <= 9; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}

		boolean bb = 1 == 1 && 1 != 1; //and 앞조건 false면 뒤조건 실행x
		System.out.println(bb);
		bb = 1==1 || 1!=1; //or 앞조건 false여도 뒤조건 실행o
	}
}
