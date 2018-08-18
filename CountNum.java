public class CountNum{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=786588;
		int count=0;
		while(n!=0) {
			int p=n%10;
			count++;
			n=n/10;
		}
System.out.println(count);
	}
}
