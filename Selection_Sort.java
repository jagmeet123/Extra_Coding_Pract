package Coding_Blocks;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {88, 55, 50, 12, 102};
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1; j<arr.length-1; j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}

}
