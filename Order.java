import java.util.Arrays;
import java.util.Scanner;
public class Order {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int num=in.nextInt();
		int arr[]=new int[num];
		int i=0;
		for( i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
