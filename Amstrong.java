import java.util.Scanner;
public class Max {
public static void main(String[] args) {
	int n,i=0,temp=0,num=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	n=in.nextInt();
	i=n;
	while(n!=0) {
	temp=n%10;
	num=num+temp*temp*temp;
	n=n/10;
	}if(num==i)
System.out.println("the number is amstrong ");
	else
		System.out.println("the number is  not amstrong ");   
	        }
}

