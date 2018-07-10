package test03;

public class LottoTest {
	public static void main(String[] args) {

		int[] ary = new int[6];

		for (int i = 0; i<ary.length; i++) {
			int ran  = (int)(Math.random()*45)+1;
			System.out.println(ary[i]);
			
		}
		
		
		
		
		
		
		
		/*
		 * int[] ary = new int[6];
		 * 
		 * for (int i = 0; i < ary.length; i++) { ary[i] = (int) (Math.random() * 45) +
		 * 1;//1~45 if(i<ary.length-1) { System.out.print(ary[i]+","); }else {
		 * System.out.print(ary[i]); } }
		 */
	}

}
