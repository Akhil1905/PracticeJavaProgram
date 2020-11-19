package Lambdapractice.Oopspractice;

public class Greeting {
	
	public void greet(Greeter greeting){
		
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting greeter=   new Greeting();
		
		Greeter helloworldgreeting=   new Greeter();
		
		greeter.greet(helloworldgreeting);
		
//		HelloWorld  functionalinterface=()-> System.out.println("Hello World from Lamda expression");
//		functionalinterface.perform();
		
	//	System.out.println(functionalinterface);
	}

}
