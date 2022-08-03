package PreviousYearCompantQuestions;
import java.util.Scanner;
public class AlternateUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
		String str=sc.nextLine();
		char s[]=str.toCharArray();
		for(int i=0;i<s.length;++i) {
			if(i%2==0) {
				s[i]=Character.toLowerCase(s[i]);
				
			}else {
				s[i]=Character.toUpperCase(s[i]);
				
			}
		}
		String result=String.valueOf(s);
		System.out.println(result);
	}

}
