package books;

import java.util.ArrayList;
import java.util.List;

import books.Books;
<<<<<<< HEAD
 

public class OracleBooks implements Books{
 
	
	public OracleBooks() {
		System.out.println("OracleBooks()");
	}
	
	
	@Override 
=======


public class OracleBooks implements Books{

	@Override
>>>>>>> f1a99d3ab90e65b8ecfe2d1df994800635d23e5c
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<String>();
		 
		 books.add("Oracle Complete Reference");
		 books.add("Oracle SQL");
		 books.add("PL/SQL Programming");
		 return books;
	}
	

}
