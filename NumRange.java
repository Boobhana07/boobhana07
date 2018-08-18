import java.util.Scanner;
public class NumRange {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		if(num>=1 && num<10){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
