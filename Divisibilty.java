package sanghavi;

import java.util.Scanner;

public class Divisibilty {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("the given numbers are");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a%b==0) {
			System.out.println(a+  "is divisible by "+ b);
		} 
		else {
			System.out.println(a+" is not divisible by"+b);
		}
	}

}
