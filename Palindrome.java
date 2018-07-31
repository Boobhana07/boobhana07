import java.util.Scanner;
public class Max {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int sum=0,count=0;
	while(n!=0) {
		sum=n%10;
	count=(count*10)+sum;
	n=n/10;
	}if(n==count)
	System.out.println("palindrome number");
	else
		System.out.println("not palindrome number");
}
}
