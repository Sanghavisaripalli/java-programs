package sanghavi;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("the given number ");
		int a= scan.nextInt();
		
		if(a%2==0) {
			System.out.println("the number is even");
			}
		else 
		{
			System.out.println("the number is odd");
		}

	}

}
