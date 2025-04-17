package ex_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public StockDAO() {
		conn = DBConn.getConnection();
	}

	// 조회
	public List<Stock> selectAll() {
		String query = "SELECT * FROM stock";
        List<Stock> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(query);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				Stock stock = new Stock();
			
				int code = rs.getInt("st_code");
				int qty = rs.getInt("st_qty");
				int p_code = rs.getInt("p_code");
			
				stock.setSt_code(code);
				stock.setSt_qty(qty);
				stock.setP_code(p_code);
				
				list.add(stock);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 특정 재고 조회
	public Stock selectByCode(int inputCode) {
		String query = "SELECT * FROM stock WHERE st_code=?";
		Stock stock = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputCode);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				stock = new Stock();
				
				int code = rs.getInt("st_code");
				int qty = rs.getInt("st_qty");
				int p_code = rs.getInt("p_code");
			
				stock.setSt_code(code);
				stock.setSt_qty(qty);
				stock.setP_code(p_code);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stock;
	}
	
	// 재고 특정 상품 조회 - 부득이 하게 재고테이블에 중복되는 물품코드가 존재하는 경우
	public List<Stock> selectByPCode(int inputPCode) {
		String query = "SELECT * FROM stock WHERE p_code=?";
		List<Stock> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputPCode);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Stock stock = new Stock();
				
				int code = rs.getInt("st_code");
				int qty = rs.getInt("st_qty");
				int p_code = rs.getInt("p_code");
			
				stock.setSt_code(code);
				stock.setSt_qty(qty);
				stock.setP_code(p_code);
				
				list.add(stock);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 특정 재고 수량 조회
	public int selectQtyByCode(int inputCode) {
		String query = "SELECT st_qty FROM stock WHERE st_code=?";
		int qty = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputCode);
			
			rs = pstmt.executeQuery();
			rs.next();
		
			qty = rs.getInt("st_qty");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return qty;
	}
	
	// 새로운 물품 재고 추가
	public int insert(int inputPCode, int inputQty){
		String query = "INSERT INTO stock VALUES(seq_st_code.NEXTVAL, ?, ?)";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputQty);
			pstmt.setInt(2, inputPCode);	
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	// 수정
	public int update(int inputCode, int inputQty) {
		String query = "UPDATE stock SET st_qty=? WHERE st_code=?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputQty);
			pstmt.setInt(2, inputCode);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 수정 - 재고 물품 증가
	public int updatePlus(int inputCode, int inputQty) {
		/*
		String query = "UPDATE stock SET st_qty=? WHERE st_code=?";
		int result = 0;
		
		int currQty = selectQtyByPCode(inputPCode);
		int updateQty = currQty + inputQty;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputQty);
			pstmt.setInt(2, updateQty);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		*/
		
		int currQty = selectQtyByCode(inputCode);
		int updateQty = currQty + inputQty;
		
		return update(inputCode, updateQty);
	}

	// 수정 - 재고 물품 감소
	public int updateMinus(int inputCode, int inputQty) {
		/*
		String query = "UPDATE stock SET st_qty=? WHERE st_code=?";
		int result = 0;

		int currQty = selectQtyByPCode(inputPCode);
		int updateQty = currQty - inputQty;
		
		if(updateQty < 0) {
			updateQty = 0;
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, inputQty);
			pstmt.setInt(2, updateQty);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		*/
		
		int currQty = selectQtyByCode(inputCode);
		int updateQty = currQty - inputQty;
		
		if(updateQty < 0) {
			updateQty = 0;
		}
		
		return update(inputCode, updateQty);
	}
	
	//삭제
	public int delete(int inputCode) {
		String query = "DELETE FROM stock WHERE st_code=?";
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
