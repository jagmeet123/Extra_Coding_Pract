package Coding_Blocks;
import java.util.*;

public class AnybaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=sc.nextInt();
		
		int a=func_AnytoDec(num,base);
		System.out.println("Any to dec: "+ a);
		int b=func_DectoAny(num, base);
		System.out.println("Deci to Any: " + b);
		sc.close();
	}
	public static int func_AnytoDec(int srcnum, int srcbase)
	{
		
		int sum=1;
		int multiplier=1;
		while(srcnum!=0)
		{
			int rem= srcnum%10;
		    sum=sum+multiplier*rem;
			multiplier=multiplier*srcbase;
			srcnum=srcnum/10;
			
		}
		return sum;
		
	}
	
	public static int func_DectoAny(int srcnum, int finalbase)
	{
		int sum=0;
		int multiplier=1;
		while(srcnum!=0)
		{
			int rem=srcnum%finalbase;
			sum=sum + (rem*multiplier);
			multiplier=multiplier*10;
			srcnum=srcnum/finalbase;
		}
		return sum;
	}
	
}
