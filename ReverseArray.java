package sanghavi;

public class ReverseArray {

	public static void main(String[] args) {
	System.out.println("the Array");
	int arr[]= {1,2,3,4,5,6,7};
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
System.out.println("The Reverse Array");
	
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]);
}
	}

}
