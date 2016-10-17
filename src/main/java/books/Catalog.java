package books;

import books.Books;


public class Catalog {
    private  Books books;
    
    public void setBooks(Books books) {
    	this.books = books;
    }

   
    public void print() {
    	
    	for(String book : books.getBooks()) {
    		System.out.println(book);
    	}
    }
    
}
