package StreamPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamwithhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> personNamelist=	new ArrayList<String>();
		
		personNamelist.add("Akhil");
		personNamelist.add("Naiya");
		personNamelist.add("Gauri");
		personNamelist.add("Sarthak");
		personNamelist.add("Rahul");
		
		//map name with their age
		Map<String, Integer> mappersopnlist=  new HashMap<>();
		
		mappersopnlist.put("Akhil", 29);
		mappersopnlist.put("Naiya", 23);
		mappersopnlist.put("Gauri", 24);
		mappersopnlist.put("Sarthak", 18);
		mappersopnlist.put("Rahul",26);
		
		List<Integer> maphashmap=personNamelist
		.stream()
		.map(personName-> mappersopnlist.get(personName))
		.collect(Collectors.toList());
		   
		System.out.println(maphashmap);
		
		
		//
		
		List<Person> newlistfrompersonclass=mappersopnlist.entrySet()
		.stream()
		.map(personName-> new Person(personName.getKey(),personName.getValue()))
		.collect(Collectors.toList());
		
		System.out.println(newlistfrompersonclass);
		
	}

}
