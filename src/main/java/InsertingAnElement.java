import java.util.Arrays;

public class InsertingAnElement {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0]=4;
		arr[1]=32;
		arr[2]= 34;
		arr[3]= 4;
		
		
		int index=2;
		
		for(int i=arr.length-1;i>0;i--)
		{
			if(i==index)
			{
				arr[i]=12;
				break;
			}
			else
			{
			arr[i]  =arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
