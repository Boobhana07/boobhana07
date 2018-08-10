public class Minimum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,9,11,3,8};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
	System.out.println(min);	
}
}
