
public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[] arr = {12,34,53,63,67,73,74,78,53,65};
		
		int max1,max2;
		max1=max2=arr[0];
		
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		
		System.out.println("second largest number is : "+max2);
	}

}
