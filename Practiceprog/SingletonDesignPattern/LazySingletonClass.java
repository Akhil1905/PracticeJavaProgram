package SingletonDesignPattern;

public class LazySingletonClass {

	private static LazySingletonClass lazysingletonobj;
	
	private LazySingletonClass(){
		
	}
	
	public static LazySingletonClass getInstance(){
		
		if(lazysingletonobj==null){
			
			synchronized(LazySingletonClass.class){
			
			if(lazysingletonobj==null){
			
			lazysingletonobj= new LazySingletonClass();
			
			}
			
		}
		
		
	}
		return lazysingletonobj;
	
	}
	
	  public void Message(){
		  System.out.println("The Lazy Method");
	  }
}
