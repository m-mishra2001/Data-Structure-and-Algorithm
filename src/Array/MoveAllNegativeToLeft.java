package Array;

public class MoveAllNegativeToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[10];
		CArray c=new CArray();
		System.out.println("enter the size of the array");
		int size=c.sc.nextInt();
		c.input(arr, size);
		int i=0;
		int j=size-1;
		
		while(i<j) {
			
			if(arr[i]<0 && arr[j]<0) {
				++i;
			}else {
				if(arr[i]>0&&arr[j]<0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					++i;
					--j;	
				}else {
					if(arr[i]>0 && arr[j]>0) {
						--j;
					}
				}
			}
			
			
			
			}
		c.print(arr, size);
		}
		
		
		
		
		
		
	}


