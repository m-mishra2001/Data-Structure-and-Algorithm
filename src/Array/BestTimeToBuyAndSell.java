package Array;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prices[]=new int[6];
		CArray c=new CArray();
		System.out.println("enter the size of the array");
		int s=c.sc.nextInt();
		c.input(prices, s);
		int profit;
        int maxProfit=0;
        int i=0;
        int j=i+1;
        while(i<prices.length){
          
           if(j==s) {
        	   break;
           }
            profit=prices[j]-prices[i];
            if(profit<0){
               ++j;
               if(j==s) {
             	  ++i;
             	  j=i+1;
               }
            }else{
              maxProfit=Math.max(profit,maxProfit);
              ++j;
              if(j==s) {
            	  ++i;
            	  j=i+1;
              }

            }
            }
        System.out.println(maxProfit);
        }
		
		
	}


