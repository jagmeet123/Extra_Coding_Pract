package Coding_Blocks;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {88, 56,96, 15,23,1};
		
		// sorting array to arr.length-1 index
		for(int i=1; i<arr.length; i++)
		{
			int val=arr[i];
			// reverse loop
			int j=i-1;
			while(j>=0 && arr[j]>val)
			{
				// shifting the minimum value
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
