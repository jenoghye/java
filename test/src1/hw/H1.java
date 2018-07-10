package hw;

public class H1 {

	public static void main(String[] args) {

		int[] a = new int[10];


		int i = 0;
		for (; i < a.length; i++) {
			a[i] = 3 * i + 3;
		}
		
		i=0;//위에서 계속 ++이 되므로 다시 초기화
		for (; i < a.length; i++) {
			System.out.println("arr[" + i + "]=" + a[i]);
		}
		
		
		/*int[] num = new int[10];
		 * for(int i = 0 ; i<num.length;i++){
		 *  num[i] = (i+1)*3;
		 *  }
		 *  
		 * 
		 */ 
		 }	

}
