import java.util.Arrays;
public class Median {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int arr[]= {5,6,7,8,1};
	  int len=arr.length/2;
	  
	  for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);  
	  }
	  Arrays.sort(arr);
	 System.out.println(Arrays.toString(arr));
	  System.out.println(arr[arr.length/2]);
			}
	}
