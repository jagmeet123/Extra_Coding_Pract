package Coding_Blocks;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,3,5,9,19,29,36,78};
		int item=36;
		int l=ar.length;
		int low=0;
		int high=l-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ar[mid]<item)
			{
				low=mid+1;
			}
			else if(ar[mid]>item)
			{
				high=mid-1;
			}
			else 
			{
				// index of item 
				System.out.println(mid);
				break;
			}
	
//			else
//			{
//			//	 if element was not present
//				System.out.print("not");
//			}
		}
		
		
	}

}
