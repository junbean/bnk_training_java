package ex08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
public class Book {
	private int bookId;
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	static int cnt = 2;
	
	
}


/*

책 테이블
도서번호, 책제목, 저자, 출판사, 가격


BookDao
Data Access Object

*/