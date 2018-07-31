import java.util.Scanner;
public class Max {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int num=0,count=0;
	while(n!=0) {
    num=n%10; 
    count++;
    n=n/10;
	}
	System.out.println(count);
	}}
