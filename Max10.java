public class Max10 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,3,4,5,6,7,9,10};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) 
			max=arr[i];}
			System.out.println(max);
		}
	}
