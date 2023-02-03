package sanghavi;

public class RightRotate {

	public static void main(String[] args) {
		System.out.println("The array");
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("The right Rotate");
	for(int i=arr.length-1;i>5;i--) {
		System.out.println(arr[i]);
	
	}
for(int i=0;i<(arr.length)/2;i++) {
	System.out.println(arr[i]);
}
	}

}
