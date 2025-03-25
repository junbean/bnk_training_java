package test;

public class Book {
	String bookName;
	String genre;
	int price;
	String publisher;
	String author;
	
	// 이름, 저자, 가격는 필수 멤버변수
	Book(String bookName, String author, String publisher){
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	// alt + sfift + s
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", genre=" + genre + ", price=" + price + ", publisher=" + publisher
				+ ", author=" + author + "]";
	}


	public String book_info_toString() {
		return "책 정보 => [bookName=" + bookName + ", genre=" + genre + ", price=" + price + ", publisher=" + publisher
				+ ", author=" + author + "]";
	}
	

}
