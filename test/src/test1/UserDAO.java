package test1;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {

	public int insertInfo(HashMap<String,String> memberInfo);
	public int deleteInfo(HashMap<String,String> memberInfo);
	public int updateInfo(HashMap<String,String> memberInfo);
	public ArrayList<HashMap<String,String>> selectUserInfoList();
}
