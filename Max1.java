public class Max {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,9,4,1};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
System.out.println(max);
	}

}
