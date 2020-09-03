package Coding_Blocks;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {88, 65, 56, 44,11};
		int l=arr.length;
		for(int i=0; i<l-1; i++)
		{
			for(int j=0; j<l-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}

}
