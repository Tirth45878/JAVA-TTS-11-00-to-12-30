package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
//try,catch,finally,throw,throws
class divide{ //umesh
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
//		throw new ArithmeticException("cannot divide by zero");
	}
	public void checkAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if(age<0) {
			throw new ArithmeticException("age is less than 0");
		}
		else {
			System.out.println(age);
		}
	}
}
public class Exceptionhandle {	//vivek
	public static void main(String[] args) {
		divide d = new divide();
		try {
			d.division();

		} catch (ArithmeticException e) {
			System.out.println("denominatorr cannot be zero");
		}		
		d.checkAge();
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i = ");
//			int i = sc.nextInt();
//			System.out.println("enter j = ");
//			int j = sc.nextInt();
//			int k = i/j;
//			System.out.println(k);
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator acannot be zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("get output perfectlly");
//		}
		
	}
}
