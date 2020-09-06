package Coding_Blocks;

public class Lower_and_Upper_Bound {

	public static void main(String args[])
	{
		int arr[]= {1,2,2,2,3,3,3,4,4,4,4,4,5,6,7};
		
		// index where 4 has the lowest index no.
		int a=lower_Bound(arr, 4);
		
		// index where 4 has the highest index no.
		int b=upper_Bound(arr, 4);
		
		System.out.println("Lower Bound: " + a);
		System.out.println("upper Bound: " + b);
		
	}
	public static int lower_Bound(int arr[], int data)
	{
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==data)
			{
				ans=mid;
				high=mid-1;
			}
			else if(arr[mid]>data)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static int upper_Bound(int arr[], int data)
	{
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==data)
			{
				ans=mid;
				low=mid+1;
			}
			else if(arr[mid]>data)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
}
