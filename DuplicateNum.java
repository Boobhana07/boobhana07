public class DuplicateNum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,5,4,3,4,2};
		int count=0;
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(i!=j) {
					if(n[i]!=n[j]) {
						count=1;
					}else {
						count=0;
						break;
					}
				}
			}
			if(count==1) {
				System.out.println(n[i]);
			}}}}
