package Compositionpratice;

import java.util.ArrayList;
import java.util.List;

public class Compositionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Book b1=  new Book("Java", "Akhil");
		 Book b2=  new Book("PHP", "Anuj");
		 
		List<Book> book= new ArrayList<Book>();
		
		book.add(b1);
		book.add(b2);
		   
		Library library= new Library(book);
		
	List<Book> books=	library.gettotalNumberofBooks();
	
	for (Book numberofbooks: books){
		
		System.out.println("Titile " + numberofbooks.titile  + " and " +  "Author "  + numberofbooks.author);
		
	}
          
	}

}
