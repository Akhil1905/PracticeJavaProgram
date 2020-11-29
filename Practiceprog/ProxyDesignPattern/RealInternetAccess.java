package ProxyDesignPattern;

public class RealInternetAccess implements OfficeInternetAccess {

	private String employeeName;
	
	public RealInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}


   @Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
	   
	   System.out.println("Internet Access granted for employee: "+ employeeName);
		
	}

}
