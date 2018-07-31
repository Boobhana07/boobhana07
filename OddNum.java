import java.util.Scanner;
public class OddNum {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int num=in.nextInt();
 for(int i=n+1;i<num;i++) {
	if(i%2!=0) 
		System.out.println(i);
	}
 }
}
