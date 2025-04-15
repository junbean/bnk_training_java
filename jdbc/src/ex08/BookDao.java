package ex08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BookDao() {
		conn = DBConn.getConnection();
	}
	
	public int insert(Book book) {
		String query = "INSERT INTO book VALUES(?, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getPrice());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		String query = "SELECT * FROM book";
	
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				
				int bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				book.setBookId(bookId);
				book.setTitle(title);
				book.setAuthor(author);
				book.setPublisher(publisher);
				book.setPrice(price);
				
				list.add(book);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<Book> select(String inputTitle) {
		String query = "SELECT * FROM book WHERE title LIKE ?";
		List<Book> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + inputTitle + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();

				int bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				book.setBookId(bookId);
				book.setTitle(title);
				book.setAuthor(author);
				book.setPublisher(publisher);
				book.setPrice(price);
				
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;	
	}
	
	public int update(Book book) {
		String query = 
				"Update book SET title=?, author=?, publisher=?, price=? WHERE bookId=?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			pstmt.setInt(4, book.getPrice());
			pstmt.setInt(5, book.getBookId());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(String title) {
		String query = "DELETE book WHERE title = ?";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
