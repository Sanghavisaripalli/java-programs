package sanghavi;

import java.util.Scanner;

public class UserSwapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("before swapping");
         int a=scan.nextInt();
         int b=scan.nextInt();
         System.out.println("After swapping");
         int temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
	}

}
