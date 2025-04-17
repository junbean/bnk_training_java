package ex_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalerymenDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public SalerymenDAO() {
		conn = DBConn.getConnection();
	}
	
	public List<Salerymen> selectAll() {
		String query = "SELECT * FROM salerymen";
		List<Salerymen> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Salerymen salery = new Salerymen();
				
				int code = rs.getInt("s_code");
				String name = rs.getString("s_name");
				String phone = rs.getString("s_phone");
				
				salery.setS_code(code);
				salery.setS_name(name);
				salery.setS_phone(phone);
				
				list.add(salery);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Salerymen selectOne(int inputCode) {
		String query = "SELECT * FROM salerymen WHERE s_code=?";
		Salerymen salery = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputCode);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				salery = new Salerymen();
				salery.setS_code(rs.getInt("s_code"));
				salery.setS_name(rs.getString("s_name"));
				salery.setS_phone(rs.getString("s_phone"));
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return salery;
	}
		
	public int insert(String inputName, String inputPhone) {
		String query = "INSERT INTO salerymen VALUES(seq_sal_code.NEXTVAL, ?, ?)";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, inputName);
			pstmt.setString(2, inputPhone);	
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int update(Salerymen salery) {
        String query = "UPDATE salerymen SET s_name=?, s_phone=? WHERE s_code=?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, salery.getS_name());
			pstmt.setString(2, salery.getS_phone());
			pstmt.setInt(3, salery.getS_code());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public int delete(int inputCode) {
        String query = "DELETE FROM salerymen WHERE s_code=?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputCode);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
}




/*

회원 기능
	회원 추가
	회원 조회
	회원 삭제
	회원 정보 수정

*/