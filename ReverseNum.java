import java.util.Scanner;
public class ReverseNum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0,s=0;
		int n=in.nextInt();
		while(n!=0) {
			sum=n%10;
			n=n/10;
		   s=(s*10)+sum;
		}
		System.out.println(s);
	}

}
