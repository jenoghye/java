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
		String sql = "insert into member(memNum, memName, memId, memPwd, memAge, memEtc, "
				+ "credat, cretim, moddat, modtim)"
				+ " values(mem_seq.nextval,?,?,?,?,?, to_char(sysdate, 'YYYYmmdd'),to_char(sysdate, 'HH24miss'),to_char(sysdate, 'YYYYmmdd'), to_char(sysdate, 'HH24miss'))";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			
			ps.setString(1, userInfo.get("memName"));
			ps.setString(2, userInfo.get("memId"));
			ps.setString(3, userInfo.get("memPwd"));
			ps.setString(4, userInfo.get("memAge"));
			ps.setString(5, userInfo.get("memEtc"));


			result =ps.executeUpdate();
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
       String sql = "delete from member";
       if(userInfo!=null) {
    	   if(userInfo.get("memNum")!=null) {
    		   sql += " where memNum=?";
    	   }
       }
       try {
    	   PreparedStatement ps = this.con.prepareStatement(sql);
    	   if(userInfo!= null) {
    		   if(userInfo.get("memNum")!=null) {
    			   ps.setString(1,userInfo.get("memNum"));
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
		String sql =  "update member";
		if(userInfo != null) {
			if(userInfo.get("memNum")!= null) {
				sql+= " set memEtc=? where memNum=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if(userInfo != null) {
				if(userInfo.get("memNum")!=null) {
					ps.setString(1, userInfo.get("memEtc"));
					ps.setString(2, userInfo.get("memNum"));
					
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
		String sql = "select * from member";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("memNum", rs.getString("memNum"));
				user.put("memName", rs.getString("memName"));
				user.put("memId", rs.getString("memId"));
				user.put("memPwd", rs.getString("memPwd"));
				user.put("memAge", rs.getString("memAge"));
				user.put("memEtc", rs.getString("memEtc"));
				/*user.put("memCredat", rs.getString("memCredat"));
				user.put("memCretim", rs.getString("memCretim"));
				user.put("memDelete", rs.getString("memDelete"));*/
				user.put("memEtc", rs.getString("memEtc"));
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
