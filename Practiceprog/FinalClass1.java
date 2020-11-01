
public class FinalClass1 extends Dog{
	
	int a=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Dog dg=	   new FinalClass1();
     int test=	dg.a;
      dg.ears();

    System.out.println( "The Variable should be from  " + test);
    
   


	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
		System.out.println("The Barking is dangrous");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("The color is red");
		
	}

	@Override
	public void breed() {
		// TODO Auto-generated method stub
		System.out.println("The breed is german shafford");
		
	}
	
     public void ears(){
		
		System.out.println("There are 2 ears  having four legs");
	}
	

}
