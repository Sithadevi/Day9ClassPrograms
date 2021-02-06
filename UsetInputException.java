package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsetInputException {
	public static void main(String args[])
	{
		int a,b,result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter a value:");
		a=sc.nextInt();
		
		System.out.println("Enter b value:");
		b=sc.nextInt();
		try
		{
			result=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not enter Zero"+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Enter only numebrs:");
		}
		finally
		{
			System.out.println("closing statements");
		}
		System.out.println("Addition is "+result);
	}

}
