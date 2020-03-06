
/**
 * Write a description of class myClass2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

import java.util.Arrays;
public class myClass2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int product = 0;
        Scanner myObj2 = new Scanner(System.in);
        int[] arr = {4, 6, 7, 9, 4, 2};
        for(int i = 0; i < arr.length;)
        {
            sum = sum + arr[i];
            product = product * arr[i];
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: "+ product); 
        
        Arrays.sort(arr);
        System.out.println("Largest element is: "+arr[arr.length-1]);
        System.out.println("Smallest element is: "+arr[0]);
        int z = 0;
        outerloop:
        for(int i = 0; i < arr.length;)
        {
            for(int j = 1; j < arr.length;)
            {
                if(arr[i] == arr[j])
                {
                    z += 1;
                    break outerloop;
                }
            }
        }
        if(z > 0)
        {
            System.out.println("There is duplicate elemnts in the array.");
        }
        
        
        
    }
    

    
}
