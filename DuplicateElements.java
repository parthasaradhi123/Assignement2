
public class DuplicateElements {

	public static void main(String[] args)
	{
		 int[] ar = {1,5,6,7,9,8,5,6,1,3,3,8};
		 
		 for(int i=0; i<ar.length;i++)
		 {
			 for(int j = i+1;j<ar.length;j++)
			 {
				 if(ar[i] == ar[j])
				 {
					 System.out.println(ar[j]);
				 }
			 }
		 }

	}

}
