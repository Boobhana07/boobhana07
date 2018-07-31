Class MaximumNum{
public static void main(String args[])
{
int arr[]=new int[] {4,6,7,8,66};
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) 
	max=arr[i];
	}
	System.out.println(max);
  }
  }
