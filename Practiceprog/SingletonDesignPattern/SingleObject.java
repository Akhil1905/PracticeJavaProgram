package SingletonDesignPattern;

public class SingleObject {

	    //Early instalize the object
	
	    private static SingleObject singletonobject=    new SingleObject();
	    
	    private SingleObject(){
	    	
	    	
	    }
	
	    
	  public static SingleObject getInstance(){
		return singletonobject;
		   
		  
	  }
	  
	  
	  public void getMessage(){
		  
		  System.out.println("Hello World!");
	  }
	  
	
}
