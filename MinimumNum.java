public class MinimumNum {
public static void main(String[] args) {
	int arr[]=new int[] {4,6,7,8,66};
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) 
	min=arr[i];
	}
	System.out.println(min);
}
}	
