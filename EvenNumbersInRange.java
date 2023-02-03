package sanghavi;

import java.util.Scanner;

public class EvenNumbersInRange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("The first no.");
		int a=scan.nextInt();
		System.out.println("The second no.");
		int b=scan.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
