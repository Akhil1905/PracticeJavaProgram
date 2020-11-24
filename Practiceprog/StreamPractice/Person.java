package StreamPractice;

public class Person {
	
	int age;
	String name;
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	

}
