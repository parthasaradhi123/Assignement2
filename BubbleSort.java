import java.util.*;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the size of the Array : ");
		int x = sc.nextInt();
		
		int[] ar = new int[x];
		
		
		for(int i = 0;i<ar.length;i++)
		{
			System.out.println("Please enter the value in array at : "+i+" position ");
			ar[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i<ar.length;i++)
		{
			for(int j = 1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int swap = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = swap;
				}
			}
		}
		
		
		for(int ele:ar)
		{
			System.out.print(ele+" ");
		}
		
		
	}

}
