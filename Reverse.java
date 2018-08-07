import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringBuilder br=new StringBuilder(str);
		br.reverse();
		System.out.println(br.toString());
		}}
