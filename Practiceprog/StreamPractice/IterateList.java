package StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> personNamelist=	new ArrayList<String>();
	
	personNamelist.add("Akhil");
	personNamelist.add("Naiya");
	personNamelist.add("Gauri");
	personNamelist.add("Sarthak");
	personNamelist.add("Rahul");
		
	
	for(String personnameiterate:personNamelist){
		
		System.out.println("The list is iterating  " +  personnameiterate);
		
	}
	}

}
