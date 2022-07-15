package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		HashMap<Integer,Integer> h=new HashMap<>();
		CArray c=new CArray();
		System.out.println("enter the size of the Array");
		int size=c.sc.nextInt();
		c.input(arr, size);
		for(int i=0;i<size;++i) {
			if(h.containsKey(arr[i])!=true) {
				h.put(arr[i],1 );
			}else {
				h.put(arr[i],h.get(arr[i])+1 );
			}
		}
		 ArrayList<Integer> a=new ArrayList<Integer>();
	     
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==2){
                a.add(entry.getKey());
            }
        }
        System.out.println(a);
        
	}

}
