package hw;

import java.util.Scanner;

public class H2 {

	public void method(int a) {
		
	}
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("숫자1-5입력");
		
		for(int i=0;i<=arr.length;i++) {
			System.out.print("숫자 입력");
			String numStr= scan.nextLine();
			arr[i]=Integer.parseInt(numStr);
			
			for(int u = 0;u<i;u++) {
			
				if(arr[u]==arr[i]) {
					System.out.println("다시 입력");
					String numStr1= scan.nextLine();
					i--;
				}else {
					String numStr1= scan.nextLine();
					arr[i]=Integer.parseInt(numStr1);
				}
				;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("숫자를 1부터 5까지 중 1개를 입력");
		String numStr = scan.nextLine();	
		arr [0]=Integer.parseInt(numStr);
				
		System.out.println("숫자를 1부터 5까지 중 1개를 입력");
		String numStr1 = scan.nextLine();
		arr [1]=Integer.parseInt(numStr1);
		
		for (int i=0;i<arr.length;i++) {
			String numStr1 = scan.nextLine();
			arr [i]=Integer.parseInt(numStr1);
			if(arr[i]==arr[i+1]) {
				
				
				System.out.println("중복값임 다시 입력");
				String numStr2 =scan.nextLine();
			}else {
				System.out.println("숫자를 1부터 5까지 중 1개를 입력");
				String numStr2 = scan.nextLine();
				arr [i+1]=Integer.parseInt(numStr2);
			}
			
		}*/
		
		
		
		
		
	
		
		
		
		
	}
}
