package Array;
import java.util.HashMap;
import java.util.Map;
public class NumberOfOccurence {

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
		int freq[]=new int[h.size()];
		int j=0;
	for(Map.Entry<Integer,Integer> i:h.entrySet()) {
		freq[j]=i.getValue();
		++j;
	}
	for(int i=0;i<freq.length;++i) {
		
		for(j=i+1;j<freq.length;++j) {
			if(freq[i]==freq[j]) {
				System.out.println(false);
			}
		}
	}
	
	
		
	}

}
