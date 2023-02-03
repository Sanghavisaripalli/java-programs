package sanghavi;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,2,4,5,5,6,6,6};
		for(int i=0;i<arr.length;i++) { 
			int count=0;
			for(int j=i;j>=0;j--) {
				if(arr[i]==arr[j]){
					count++;
				}}
				if(count==1){
					System.out.println(arr[i]);
				}
			}
		}
		

	}


