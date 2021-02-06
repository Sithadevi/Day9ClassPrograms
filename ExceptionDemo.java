package day9;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		int arr[]=new int[5];
		System.out.println("Bnagalore");
		System.out.println("50 kms completed");
		System.out.println("100 kms completed");
		try
		{
			System.out.println(a/b);
			System.out.println("First");
			arr[7]=10;
			System.out.println("second");
		}
		catch(ArrayIndexOutOfBoundsException obj){
			System.out.println("Do not give zero");
		}
		catch(ArithmeticException obj){
			System.out.println("Divided by zero");
		}
		/*finally {
			System.out.println("The program completed successfully");
		}*/
		System.out.println("Chennai");
		System.out.println("150 kms completed");
		System.out.println("200 kms completed");
		System.out.println("Successfylly Reached to chennai");
	}
}
