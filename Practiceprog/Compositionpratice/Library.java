package Compositionpratice;

import java.util.List;

public class Library {
	
	private final List<Book> practice;
	
	Library(List<Book> practice){
		 this.practice=practice;
		
	}

	 public List<Book> gettotalNumberofBooks(){
		  
		 return practice ;
		 
	 }
	 
}
