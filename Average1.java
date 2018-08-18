public class Average1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=12345;
	int count=0;
	int s=0;
	while(n!=0) {
		int p=n%10;
		count++;
		s=s+p;
		n=n/10;
	}
	int avg=s/count;
System.out.println(avg);
	}

}
