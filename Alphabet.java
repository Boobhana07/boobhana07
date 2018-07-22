import java.util.Scanner;
public class Alphabet {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    char ch=in.next().charAt(0);
       if(ch>='a'&& ch<='z' || ch>='A' && ch<='z') {
            System.out.println("Alphabet");
       }
       else {
    	   System.out.println("NO");
       }
}}
