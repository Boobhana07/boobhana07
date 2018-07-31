import java.util.Scanner;
public class Max {
public static void main(String[] args) {
	int n;
    int count=0;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    n=in.nextInt();
    for(int i=2;i<n;i++) {
    	if(n%i==0) { 
    		count++;
    	    break;
    	}  	
    }
if(count==0) 
    		System.out.println("the given number is prime number");
    	else 
    		System.out.println("the given number is not a prime number");
        }
}
