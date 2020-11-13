package GenericConcept;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Location location=		new Location("123", "STORE");
		
	  Response<Location> responselocation= new Response<Location>();
//	  responselocation.setResponse(location);
//	  responselocation.status=200;
	  
		  System.out.println(responselocation);

	}

}
