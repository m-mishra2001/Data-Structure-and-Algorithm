package PreviousYearCompantQuestions;
import java.util.Scanner;
public class TcsHashAndStarInStringCount {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char s[]=str.toCharArray();
		int a=0;
		int b=0;
		for(char c:s) {
			if(c=='#')
				++a;
			else {
				if(c=='*')
					++b;
			}
		}
		int result=b-a;
		System.out.println(result);
	}

}
