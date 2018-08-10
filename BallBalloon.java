import java.util.Scanner;
public class BallBalloon {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		int count=0;
		int counter=0;
		for(int i=0;i<s1.length();i++) {
			count=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
				}
			}
			if(count<1) {
				counter++;
			}
		}
		for(int i=0;i<s2.length();i++) {
			count=0;
			for(int j=0;j<s1.length();j++) {
				if(s2.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			if(count<1) {
				counter++;
			}}
		System.out.println(counter);

	}

}
