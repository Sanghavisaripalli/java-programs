package sanghavi;

import java.util.Scanner;

public class DifferenceBetweenEvenAndOdd {

	public static void main(String[] args) { 
		int evensum=0,oddsum=0,diff=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("The first no");
		int a=scan.nextInt();
		System.out.println("The second no.");
		int b=scan.nextInt();
		System.out.println("even number");
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
				evensum=evensum+i;
				System.out.println(evensum);
			}
		}
			System.out.println("odd number");
			for(int s=a;s<=b;s++) {
			if(s%2!=0) {
				System.out.println(s);
				oddsum=oddsum+s;
				System.out.println(oddsum);
			}}
			
		diff=evensum-oddsum;
		System.out.println(diff);
			
			

}}
