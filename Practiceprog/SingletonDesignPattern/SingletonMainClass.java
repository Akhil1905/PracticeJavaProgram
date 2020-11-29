package SingletonDesignPattern;

public class SingletonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleObject obj=SingleObject.getInstance();
		obj.getMessage();
		
		LazySingletonClass obj1 =LazySingletonClass.getInstance();
		obj1.Message();
		
	}

}
