package Array;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int digits[]= {9,8,7,6,5,4,3,2,1,0};
		   int s=digits.length;
	        // int arr[]=new int[digits.length+1];
	        ArrayList<Integer> arr=new ArrayList();
	        int i;
	      for( i=0;i<=digits.length-2;++i){

	      arr.add(digits[i]);
	      }
	        if(digits[i]==9){
	     arr.add(1);
	            arr.add(0);
	        }else{
	            arr.add(digits[i]+1);
	        }
	        
	       
	        
	        System.out.println(arr);
	        int result[]=new int[arr.size()];
	        for(int j=0;j<arr.size();++j){
	        	System.out.print(arr.get(i));
	            result[i]=arr.get(i);
	        }
	        
	        for(int j=0;j<result.length;++j) {
	        	System.out.print(result[j]);
	        }
	        
	}

}
