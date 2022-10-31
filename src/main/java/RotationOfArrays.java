import java.util.Arrays;

public class RotationOfArrays {
	
	// left rotation..
	static void leftRotation(int arr[],int temp)
	{
		for(int i = 1; i<arr.length;i++)
		{
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void RightRotation(int arr[],int temp1)
	{
	for(int i =arr.length-1; i>0;i--)
	{
		arr[i]=arr[i-1];
	}
	 arr[0]=temp1;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,32,412,412,12,321,4124,412};
		
		int temp = arr[0];
		int temp1 = arr[arr.length-1];
		

			RightRotation(arr, temp1);
		
		
		
		
	}

}
