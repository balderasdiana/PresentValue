/* 
Author: Balderas, Diana
Submitted: 2018/10/10
*/

import java.util.Scanner;

public class PresentValue
{
public static void main(String[] args)
	{
	double presentValue;
	double futureValue;
	double rate;
	double numberofYears;
	double total;
    
	Scanner keyboard = new Scanner(System.in);
	
	  
	System.out.print("Enter the amount of money you want in your account: ");
	futureValue = keyboard.nextDouble();
    
    
	System.out.print("Enter the number years you plan to let the money sit the account: ");
	numberofYears = keyboard.nextDouble();
    
	keyboard.nextLine();
    
	System.out.print("Enter your interest rate: ");
	rate = keyboard.nextDouble();
    

	total = (double) Math.pow(1 + rate, numberofYears);
	presentValue = futureValue / total;
    
	System.out.printf("This is the amount you need to deposit today $%,.2f ", presentValue);
	
	}
}
