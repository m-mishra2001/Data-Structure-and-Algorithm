package String;

import java.util.ArrayList;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Character> arr=new ArrayList();
       arr.add('m');
       arr.add('u');
       arr.add('s');
       arr.add('k');
       arr.add('a');
       arr.add('n');
//       char a[]= {'m','u','s','k','a','n'};
//       String str=String.valueOf(a);
       StringBuilder str=new StringBuilder();
       for(Character ch:arr) {
    	   str.append(ch);
       }
       String s=str.toString();
       System.out.println(s);
       
       
       
		
		
	}

}
