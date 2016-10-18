package books;

import books.Books;


public class CDICatalog {
    private  Books books; 
    
    
    public CDICatalog(Books books) {
		 this.books = books;
	}

   
    public void print() {
    	for(String book : books.getBooks()) {
    		System.out.println(book);
    	}
    }
    
}
