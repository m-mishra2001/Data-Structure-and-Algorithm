package PreviousYearCompantQuestions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class ParkinLotQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;++i) {
			System.out.println("row"+i);
			for(int j=0;j<col;++j) {
				arr[i][j]=sc.nextInt();
			}
		}
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int num=0;
		for(int i=0;i<row;++i) {
			for(int j=0;j<col;++j) {
				if(arr[i][j]==1)
					++num;
			}
			hs.put(i, num);
			num=0;
			
			
		}
		int value=0;
		int r=0;
		System.out.println(hs);
		for(Map.Entry<Integer, Integer> e:hs.entrySet()) {
			if(e.getValue()>value) {
				value=e.getValue();
				System.out.println(value);
				r=e.getKey();
			}
		}
		++r;
		System.out.println("result="+r);
		
		
		
	}

}
