public class FindSpace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=" jhm klj mjk km";
int l=s1.length();
int count=0;
for(int i=0;i<l;i++)
{
	char c=s1.charAt(i);
    if(c==' ')
    {
   count++;
    }
  }
System.out.println(count);
	}
}
