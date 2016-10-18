package books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		 ApplicationContext  context = 
				 new ClassPathXmlApplicationContext ("books/beans.xml"); 
		 
	 
<<<<<<< HEAD
//		 Catalog cat = context.getBean("catalog", Catalog.class);
//		 cat.print();
//		 
		 
		 CDICatalog cat2 = context.getBean("cdiCatalog", CDICatalog.class);
		 cat2.print(); 
=======
		 Catalog cat = context.getBean("catalog", Catalog.class);
		 cat.print();
>>>>>>> f1a99d3ab90e65b8ecfe2d1df994800635d23e5c

     }

}
