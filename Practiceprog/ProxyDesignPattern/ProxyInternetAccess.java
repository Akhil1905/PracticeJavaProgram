package ProxyDesignPattern;

public class ProxyInternetAccess implements OfficeInternetAccess{

	private String employeeName;
	
	private RealInternetAccess realinternetAccess;
	
	public ProxyInternetAccess(String employeeName) {
		
		this.employeeName = employeeName;
	}
	
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		
		if(getRole(employeeName)>4){
			
			realinternetAccess=	new RealInternetAccess(employeeName);
			realinternetAccess.grantInternetAccess();
		}else{
			System.out.println("No Internet access granted. Your job level is below 5");
		}
		
	}
	
	public int getRole(String employeeName){
		
		return 10;
		
	}

}
