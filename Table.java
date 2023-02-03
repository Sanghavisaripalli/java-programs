package sanghavi;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
System.out.println("the number");
int a=scan.nextInt();
for(int i=1;i<=12;i++) {
	System.out.println(a+ "*" +i+"=" +a*i);
}
	}

}
