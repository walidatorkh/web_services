package core;

public class Store {

	private CD[] cds = new CD[10];
	private Book[] books = new Book[10];

	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				break;
			}
		}
	}

	public void addCd(CD cd) {
		for (int i = 0; i < cds.length; i++) {
			if (cds[i] == null) {
				cds[i] = cd;
				break;
			}
		}
	}

	public void deleteBook(int index) {
		books[index] = null;
	}

	public void deleteCd(int index) {
		cds[index] = null;
	}

	public Book getBook(int index) {
		return books[index];
	}

	public CD getCd(int index) {
		return cds[index];
	}
	
	public Book[] getAllBooks(){
		return books;
	}
	public CD[] getAllCds(){
		return cds;
	}

}
