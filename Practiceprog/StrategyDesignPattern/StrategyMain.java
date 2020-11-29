package StrategyDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
         System.out.print("Enter the first value: ");  
         float value1=Float.parseFloat(br.readLine());  
         System.out.print("Enter the second value: ");  
         float value2=Float.parseFloat(br.readLine());  
		
		Context context=	 new Context(new Addition());
		
		 System.out.println(context.docalculation(value1,value2)) ;
	}

}
