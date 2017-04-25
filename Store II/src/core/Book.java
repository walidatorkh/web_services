package core;

public class Book extends Item {

	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, double price, String author) {
		super(title, price);
		this.author = author;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Book [title=" + getTitle() + ", price=" + getPrice() + ", author=" + author + "]";
	}
	
	
}
