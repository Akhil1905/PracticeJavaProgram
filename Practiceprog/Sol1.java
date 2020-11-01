import java.util.Scanner;

public class Sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=   new Scanner(System.in);
	        int t= sc.nextInt();
	        while(t-->0){
	        	
	        	Prob1 pb=    new Prob1();
	        int a=	   sc.nextInt();
	       int b=    sc.nextInt();
	       
	         pb.add(a, b);
	        	  
	        	pb.mul(a, b);
	        	pb.task(a, b);
	        }
		   

	}

}
