import java.util.Scanner;

public class ArrayLinearSearch {

	static Scanner scn=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arr={99,88,77,65,55};
		bubbleSort(arr);
		
//		for(int i=0; i< arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//display(arr);
	}
	 // TODO Auto-generated method stub
			
	static int temp=0;
		public static void bubbleSort(int[] arr){
		
			for(int counter =0; counter<arr.length-1; counter++){
				for(int j= 0; j<arr.length-1-counter;j++){
					if(arr[j]>arr[j+1]){
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					System.out.println( arr[j] + " ");
				}
				//System.out.println("");
//				System.out.print("Arrayele: "+ arr[counter]);
			}
		}
		
//		public static void display(int [] arr)
//		{
//			
//		}
}