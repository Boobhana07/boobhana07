import java.util.Scanner;
public class Max {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int num=in.nextInt();
	int sum=0;

for(int i=0;i<num;i++) {
	sum=(int) Math.pow(n,num);
}
	System.out.println(sum);
}
}
