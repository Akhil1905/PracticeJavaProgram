//Write a Java program to iterate through all elements in a array list. 

package Collectionpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> iterratelist=    new ArrayList<String>();
		
		iterratelist.add("Red");
		iterratelist.add("Green");
		iterratelist.add("Red");
		
		for(String s: iterratelist){
			System.out.println(s);
			
		}
		
		Set<String> set =     new HashSet<String>();
		 boolean ss=     set.addAll(iterratelist);
		 
		    System.out.println(set);
		      
		      
		
		    
		
	}

}
