package ch10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ch09.BCrypt;
import ch09.SHA256;

public class LogonDBBean {
	private static LogonDBBean instance = new LogonDBBean();
	
	public static LogonDBBean getInstance() {
		return instance;
	}
	
	private LogonDBBean() {}
	
	private Connection getConnection() throws Exception {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsptest");
		return ds.getConnection();
	}
	
	public int userCheck(String id, String passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = -1;
		
		SHA256 sha = SHA256.getInstance();
		
		try {
			conn = getConnection();
			
			String orgPass = passwd;
			String shaPass = sha.getSha256(orgPass);
			
			pstmt = conn.prepareStatement(
					"SELECT passwd FROM member WHERE id = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbpasswwd = rs.getString("passwd");
				
				if(BCrypt.checkpw(shaPass, dbpasswwd))
					x = 1;
				else
					x = 0;
			} else
				x = -1;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)
				try { rs.close(); } catch (SQLException ex) {}
			if(pstmt != null)
				try { pstmt.close(); } catch (SQLException ex) {}
			if(conn != null)
				try { conn.close(); } catch (SQLException ex) {}
		}
		return x;
	}
}
