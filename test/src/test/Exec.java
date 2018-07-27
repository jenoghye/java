package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl(DBCon.getCon());
		
		ArrayList<HashMap<String,String>> userList = udao.selectUserInfoList();

		for(HashMap<String,String> user:userList) {
			System.out.println(user);
		}
		
		 udao = new UserDAOImpl(DBCon.getCon());
		
		HashMap<String,String> userInfo = new HashMap<String,String>();
		/* userInfo.put("memNum","31");
		
		
		if(udao.deleteUserInfo(userInfo)==1) {
			System.out.println("ok");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(userList);
	
		 udao = new UserDAOImpl(DBCon.getCon());
		 userInfo.put("memNum","32");
			
		 userInfo.put("memEtc","꾸꾸1");
		
		if(udao.updateUserInfo(userInfo)==1) {
			System.out.println("성공");
		}else {
			System.out.println("뀨뀨");
		}
		
		System.out.println(userList);
	}	*/
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("몇명등록?");

	int max = Integer.parseInt(scan.nextLine());

	for (int i = 0; i < max; i++) {

		System.out.println("name");
		String name = scan.nextLine();
		System.out.println("id");
		String id= scan.nextLine();
		System.out.println("pwd");
		String pwd= scan.nextLine();
		System.out.println("age");
		String age = scan.nextLine();
		System.out.println("etc");
		String etc = scan.nextLine();

		
		userInfo.put("memName",name);
		userInfo.put("memId",id );
		userInfo.put("memPwd", pwd);
		userInfo.put("memAge",age);
		userInfo.put("memEtc", etc );

		if (udao.insertUserInfo(userInfo) == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		System.out.println(userList);
	}
	}
}
