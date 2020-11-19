//Write a Java program to create a new array list, add some colors (string) and print out the collection

package Collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class Listpractice {

	public static void main(String args[]){
		
		
		List<String> colors=   new ArrayList<String>();
		
		    
		colors.add("Red");
		colors.add("Green");
		colors.add("Red");
		
		System.out.println(colors);
	}
}
