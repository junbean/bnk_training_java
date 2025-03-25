package test;

public class Book_test {

	public static void main(String[] args) {
		Book book = new Book("어린왕자", "생덱쥐페리", "황금가지");
		
		System.out.println(book.getBookName());
		System.out.println(book.getAuthor());
		System.out.println(book.getPublisher());
	
		book.setPrice(10000);
		book.setGenre("동화");
		
		String book_info = book.book_info_toString();
		System.out.println(book_info);
		
	}
}
