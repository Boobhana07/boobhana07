public class LargeSmall {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {42,54,2,334,76,97};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];}
} System.out.println(min);
	System.out.println(max);

}
}
