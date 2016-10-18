package books;

import books.Books;


public class Catalog {
<<<<<<< HEAD
    private  Books books; 
    
    
    public Catalog() {
		System.out.println("Catalog()");
	}


	public void setBooks(Books books) {
=======
    private  Books books;
    
    public void setBooks(Books books) {
>>>>>>> f1a99d3ab90e65b8ecfe2d1df994800635d23e5c
    	this.books = books;
    }

   
    public void print() {
    	
    	for(String book : books.getBooks()) {
    		System.out.println(book);
    	}
    }
    
}
