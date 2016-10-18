package books;

import java.util.ArrayList;
import java.util.List;


public class JavaBooks implements Books{
<<<<<<< HEAD
     
	public JavaBooks() {
		System.out.println("JavaBooks()");
	}
	
=======

>>>>>>> f1a99d3ab90e65b8ecfe2d1df994800635d23e5c
	@Override
	public List<String> getBooks() {
		 List<String>  books = new ArrayList<String>();
		 
		 books.add("Java Complete Reference");
		 books.add("Spring in Action");
		 return books;
	}
	

}
