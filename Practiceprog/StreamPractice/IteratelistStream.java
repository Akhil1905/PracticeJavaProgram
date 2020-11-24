package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IteratelistStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Stream
		//2. Source of Stream
		//3. operation on Stream: Map(make changes in list and filter for conditions)
		//terminal: Sum, count

	List<String> personNamelist=	new ArrayList<String>();
	
	personNamelist.add("Akhil");
	personNamelist.add("Naiya");
	personNamelist.add("Gauri");
	personNamelist.add("Sarthak");
	personNamelist.add("Rahul");
		
//list having name start with A
	List<String> newstringlist=personNamelist
	.stream()
	.filter(personName -> {
		if(personName.startsWith("A")){
			return true;
		}else{
			return false;}
		})
	.collect(Collectors.toList());
	
	System.out.println(newstringlist);
	
	
	//list ends with t
	
	
  List<String> listendswitht=	personNamelist
	.stream()
	.filter(personName -> {if(personName.endsWith("t")){
		return true;
	}else{
		return false;
	}
		
	})
	.collect(Collectors.toList());
	
  
  System.out.println(listendswitht);
	
	
	
	//Stream without if conditions
	
	List<String> listhavinga=personNamelist
	.stream()
	.filter(personName-> personName.contains("a"))
	.collect(Collectors.toList());
	
	System.out.println(listhavinga);
	
	//Map operation and map each element of filtered stream and concat Mr. to each element
	
	List<String> listconcatwithmap=personNamelist
	.stream()
	.filter(personName-> personName.startsWith("A"))
	.map(personName -> "Mr." + personName)
	.collect(Collectors.toList());
	
	System.out.println(listconcatwithmap);
	
	}
	
}
