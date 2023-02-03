package sanghavi;

public class MinimumElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,0,4,2,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min)
			min=arr[i];
		}
		{
			System.out.println("The Minimum Element:" +min);
		}
			}
		

	}


