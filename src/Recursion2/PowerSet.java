package Recursion2;

import java.util.ArrayList;

public class PowerSet {
     public static ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
     
	public static void powerSet(int nums[],int i){
		if(i==nums.length) {
			return;
		}
		ArrayList<ArrayList<Integer>> temp=result;
	
		for(int j=0;j<temp.size();++j) {
			
			for(ArrayList<Integer> x:temp) {
				x.add(nums[i]);
			}
		}
		
		
	
	 
	  System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3};
//		ArrayList<ArrayList<Integer>> temp=new ArrayList<ArrayList<Integer>>();
//		temp.add(new ArrayList<Integer>());
//		temp.get(0).add(56);
//		temp.add(new ArrayList<Integer>());
//		temp.get(1).add(50);
//		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
//		result.add(new ArrayList<Integer>());
//
//		result.addAll(temp);

	    result.add(new ArrayList<Integer>());
	    System.out.println(result);
	    powerSet(nums,0);

	}

}
