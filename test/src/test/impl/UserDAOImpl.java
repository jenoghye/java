package test.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test.DBCon;

public class UserDAOImpl implements test.UserDAO {
	private Connection con;
	int result = 0;

	public UserDAOImpl(Connection con) {
		this.con = con;
	}

	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		String sql = "insert into User_info(uiName, uiAge, uiCredat, uiCretim, uiEtc, uiDelete, uiEtc)"
				+ "values(?,?,date_format(now(),%Y%m%d),date_format(now(),%H%i%s),?,?,'0')";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, "uiName");
			ps.setString(3, userInfo.get("uiCredat"));

			ResultSet rs = ps.executeQuery();
			this.con.commit();
		} catch (SQLException e) {
			try{
				this.con.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {
       String sql = "delete from user_info";
       if(userInfo!=null) {
    	   if(userInfo.get("uiName")!=null) {
    		   sql += " where uiName=?";
    	   }
       }
       try {
    	   PreparedStatement ps = this.con.prepareStatement(sql);
    	   if(userInfo!= null) {
    		   if(userInfo.get("uiName")!=null) {
    			   ps.setString(1,userInfo.get("uiName"));
    		   }
    	   }
    	   
    	   result = ps.executeUpdate();
    	   this.con.commit();
       }catch(SQLException e) {
    	   try {
    		   this.con.rollback();
    	   }catch(SQLException e1){
    		  e1.printStackTrace();
    	   }finally {
    		   DBCon.close();
    	   }
       }
		return  result;
	}

	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {
		String sql =  "update user_info";
		if(userInfo != null) {
			if(userInfo.get("uiName")!= null) {
				sql+= "set uiEtc=? where uiName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if(userInfo != null) {
				if(userInfo.get("uiName")!=null) {
					ps.setString(1, userInfo.get("uiEtc"));
					ps.setString(2, "uiName");
					
				}
				
			}
			result= ps.executeUpdate();
			this.con.commit();
		}catch(SQLException e) {
			try {
				this.con.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return result;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfoList() {
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
		String sql = "select * from user_info";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				user.put("uiCredat", rs.getString("uiCredat"));
				user.put("uiCretim", rs.getString("uiCretim"));
				user.put("uiDelete", rs.getString("uiDelete"));
				user.put("uiEtc", rs.getString("uiEtc"));
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
		}

		return userList;

	}

}
