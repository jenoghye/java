package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	public static ArrayList<HashMap<String,String>> user = new ArrayList<HashMap<String,String>>();
	
	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸�");
		String name = scan.nextLine();
		
		System.out.println("����");
		String age = scan.nextLine();
		
		hm.put("uName", name);
		hm.put("uAge",age);
		
	
		
		
	}

}
