package ProxyDesignPattern;

public class ProxyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OfficeInternetAccess accessinternet=  new ProxyInternetAccess("Akhil Sharma");
		
		accessinternet.grantInternetAccess();

	}

}
