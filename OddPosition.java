package sanghavi;

public class OddPosition {

	public static void main(String[] args) {
	
				System.out.println("The array");
				int arr[]= {1,2,3,5,5,9,7,7,9};
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
		System.out.println("The odd position array");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
			}

		


	}


