package StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class IteratelistJavaEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> personNamelist=	new ArrayList<String>();
	
	personNamelist.add("Akhil");
	personNamelist.add("Naiya");
	personNamelist.add("Gauri");
	personNamelist.add("Sarthak");
	personNamelist.add("Rahul");
		
//Iterate list from Java 8	  
	personNamelist.forEach(personName -> System.out.println(personName));
	}

}
