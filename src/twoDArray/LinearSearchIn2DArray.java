package twoDArray;
import java.util.*;

public class LinearSearchIn2DArray {
 
	public static Scanner sc=new Scanner(System.in);
	public static void input(int row,int col,int arr[][]) {
		System.out.println("enter the array element");
		for(int i=0;i<row;++i) {
			for(int j=0;j<col;++j) {
		    arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void print(int row,int col,int arr[][]) {
		for(int i=0;i<row;++i) {
			for(int j=0;j<col;++j) {
		    System.out.println(arr[i][j]);
			}
		}
		
	}
	public static int linearSearch(int arr[][],int row,int col,int key) {
		
		for(int i=0;i<row;++i) {
			for(int j=0;j<col;++j) {
				if(arr[i][j]==key) {
					return 0;
				}
			}
		}
		return -1;
	}
	public static void rowSum(int [][]nums,int row,int col) {
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		
		for(int i=0;i<row;++i) {
			int sum=0;
			for(int j=0;j<col;++j) {
				sum+=nums[i][j];
			}
			hp.put(i, sum);
		}
		System.out.println(hp);
		int m=0;
		for(Map.Entry<Integer, Integer> h:hp.entrySet()) {
			m=Integer.max(m,h.getValue());
		}
		System.out.println("maximum row sum is "+m);
		
	}
	public static void main(String[]args) {
		
		int arr[][]=new int[10][10];
        System.out.println("enter the number of rows and columns int the matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        input(row,col,arr);
        
//      print(row,col,arr);
//System.out.println("enter the element to be search for");              
//        int key=sc.nextInt();
//       int result= linearSearch( arr,row,col,key);
//        if(result==0) {
//        	System.out.println("element found");
//        	
//        }else {
//        	System.out.println("elemnt not found");
//        }
        rowSum(arr,row,col);
        
	}
	
	
	
	
}
