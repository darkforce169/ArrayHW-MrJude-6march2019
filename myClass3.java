
/**
 * Write a description of class myClass3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class myClass3
{
    public static void main(String[] args)
    {
        int[] arr1 = {3, 6, 4, 3, 7, 5, 9, 0, 5, 4};
	int[] arr2 = new int[5];
	int[] arr3 = new int[5];


	for (int i = 0; i < 10; i++)
	{
	    if (i < 5)
	    {
		arr2[i] = arr1[i];
            }       
	    else
		arr3[i - 5] = arr1[i];
	}
        System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));
	
	int len;
	len = arr1.length;
	int temp = arr1[len - 1];
	for(int i = 0; i < arr1.length;)
	{
	    temp = arr1[len - 1];
	    arr1[len - i - 1] = arr1[len - i - 2]; 
	}
	arr1[0] = temp;
	System.out.println(Arrays.toString(arr1));
	System.out.println("Sorting array in ascending order.");
	Arrays.sort(arr1);
	System.out.println("Array in ascending order: "+ Arrays.toString(arr1));
    }
    
  
}
    