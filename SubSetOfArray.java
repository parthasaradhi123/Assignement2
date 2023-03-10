class Partha
{
	static boolean isSubset(int ar1[], int ar2[], int m, int n)
	{
		int i =0;
		int j =0;
		for(i = 0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(ar2[i] == ar1[j])
				{
					break;
				}
			
			}
			if(j == m)
			{
				return false;
			}
		}
		return true;
	}
}
public class SubSetOfArray {

	public static void main(String[] args) 
	{
	      int ar1[] = { 11, 10, 13, 21, 30, 70 };
	        int ar2[] = { 11, 30, 70, 10 };
	        
	        int m = ar1.length;
	        int n = ar2.length;
	      // Partha p = new Partha();
	        
	        boolean b = Partha.isSubset(ar1, ar2, m, n);
	        if (b)
	            System.out.print("ar2[] is subset of arr1[] ");
	        else
	            System.out.print("ar2[] is not subset of arr1[] ");
	        
	        
	}

}
