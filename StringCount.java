public class CountString {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "laptop is good";
		int count=0;
		int counter=0;
	for(int i=0;i<str.length();i++) {
	
		if(str.charAt(i)!=0) {
			count++;
		}
	if(count>=1) {
		counter++;
	}}System.out.println(counter);

	}
}
