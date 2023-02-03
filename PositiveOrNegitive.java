package sanghavi;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
System.out.println( "enter number");
int a=scan.nextInt();
if(a>=0) {
	System.out.println( a +"given number is positive number");
}

else if(a<0) {
	System.out.println( a +"given number is negitive number");
}
	}

}
