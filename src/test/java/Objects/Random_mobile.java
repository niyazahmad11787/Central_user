package Objects;

import java.util.Random;

public class Random_mobile 
{

	public static String r_number() 
	{
		Random rand = new Random();

		 int num1, num2, num3;

		    num1 = rand.nextInt (900) + 100;
		    num2 = rand.nextInt (643) + 100;
		    num3 = rand.nextInt (9000) + 1000;

		   String number = num1+""+num2+""+num3;
		  
		   char text = number.charAt(0);
		   if(text == '6' || text == '7' || text == '8' || text == '9') {
			   String finalNumberString=number.toString();
			   System.out.println(finalNumberString);
			   return finalNumberString;
		   }else {
			   
			   return r_number();
			   
		   }
		   
	}

	public static void main(String[] args) 
	{
	String numeberString = r_number();	
	}
}
