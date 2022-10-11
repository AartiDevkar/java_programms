//concatenate array using copy()
import java.util.*;

class copyarray
{
	public static void main(String args[])
	{
	int[] arr1 = {5,6,7,8,7,3};          
	int[] arr2 = {1,2,3,6,9,0};    
	int fal = arr1.length;          
	int sal = arr2.length;     
	int[] result = new int[fal + sal];    
	System.arraycopy(arr1, 0, result, 0, fal);  
	System.arraycopy(arr2, 0, result, fal, sal);  
	System.out.println(Arrays.toString(result));      
}

}