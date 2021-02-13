package feb13;

import java.util.ArrayList;
import java.util.List;

class Book{
	String bName;

	public Book(String bName) {
		super();
		this.bName = bName;
	}
}

class Library{
	List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	
	public List<Book> getTotalBooks()
	{
		return books;
	}	
}
public class CompositionEx {

	public static void main(String[] args)
	{
		Book book1 = new Book("Science");
		Book book2 = new Book("Maths");
		Book book3 = new Book("English");
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		Library lib = new Library(books);
		
		List<Book> list = lib.getTotalBooks();
		for(Book b:list)
		{
			System.out.println(b.bName);
		}
	}

}
