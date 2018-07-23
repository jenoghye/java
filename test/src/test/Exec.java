package test;

import java.util.ArrayList;
import java.util.HashMap;

import test.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl(DBCon.getCon());
		
		ArrayList<HashMap<String,String>> userList = udao.selectUserInfoList();
	}

}
