package String;
import java.util.Scanner;
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String();
		String temp=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int i=0;
		
		while(i<s.length()) {
			while(i<s.length()&&s.charAt(i)==' ') {
				++i;
			}
			int j=i+1;
			while(j<s.length()&&s.charAt(j)!=' ') {
				++j;
			}
			if(j<=s.length()) {
		
				temp=temp+ s.substring(i, j)+" ";
				
			}
//			else {
//				temp=temp+s.substring(i, j);
//				
//			}
			
			i=j+1;
			
			
		}
		
		 i=temp.length()-1;
		 int j=i-1;
		String result=new String();
		while(i>=0) {
			while(j>=0 && temp.charAt(j)!=' ' ) {
				--j;
			}
			System.out.println("i="+i+"j="+j);
			result=result+temp.substring(j+1, i)+" ";
			System.out.println(result);
			i=j;
			j=i-1;
		}
		
		System.out.println(result);
		
		
		
	}

}
