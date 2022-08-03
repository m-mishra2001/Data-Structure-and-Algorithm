package Relevel;

public class LeetCodeContest {
	 public static int calZeroes(int []nums){
	        int val=0;
	        for(int i=0;i<nums.length;++i){
	            if(nums[i]==0){
	                ++val;
	            }
	        }
	        return val;
	        
	    }
	    
	    public static int smallest(int[]nums){
	    	
	        int min=0;
	        for(int i=0;i<nums.length;++i){
	           if(nums[i]!=0) {
	        	   min=nums[i];
	        	   
	           }
	        }
	       
	        for(int i=0;i<nums.length;++i) {
	        	if(nums[i]<min&&nums[i]!=0) {
	        		min=nums[i];
	        	}
	        }
	       
	        return min;
	    }
	    public static int minimumOperations(int[] nums) {
	        int n=calZeroes(nums);
	        int move=0;
	        while(n!=nums.length){
	        	
	        int min=smallest(nums);
	            for(int i=0;i<nums.length;++i){
	                if(nums[i]!=0){
	                    nums[i]=nums[i]-min;
	                }
	            }
	            ++move;
	            n=calZeroes(nums);
	        }
	        
	        
	        return move;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []nums= {1,5,0,3,5};
    System.out.println(minimumOperations(nums)); 
     
//      int min=smallest(nums);
//      for(int i=0;i<nums.length;++i){
//          if(nums[i]!=0){
//              nums[i]=nums[i]-min;
//          }
//         
//      }
//      for(int i=0;i<nums.length;++i){
//         System.out.print(" "+ nums[i]);
//      }
//      int n=calZeroes(nums);
     
      
	}

}
