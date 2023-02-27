import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
//		final String str = "Shrey"; //constant
//		
////		str = "Royal";
//		System.out.println(str);
		
		
//		String s = "abc";
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Program Starts");
		
		
//		System.out.println("Enter a: ");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter b: ");
//		int b = sc.nextInt();
		
		try {
//			System.out.println(a/b);	//run time exception (/ by zero)
//			System.out.println(1/0);	//compile time Exception
//			System.out.println(s.length());
//			System.out.println(Integer.parseInt(s));
			System.out.println(arr[7]);
		} catch (Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		} 
//		finally {
//			System.out.println("finally block");
//		}
		
		System.out.println("Program Ends");

	}

}

//Exceptions -> errors -> compile time / run time
//calculator -> division -> / by zero -> (2/0)