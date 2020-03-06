
/**
 * Write a description of class myClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class myClass
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int[] integers = new int[10];
        for(int i = 0; i < 10; i++)
        {
            int input = myObj.nextInt();
            integers[i] = input;
        }
        System.out.println("Outputs: ");
        for(int i : integers)
        {
            System.out.print(i+" ");
            
        }
        System.out.println();
        System.out.println("Enter  number: ");
        int enternum = myObj.nextInt();
        boolean flag = false;
        for(int i = 0; i < 10; i++)
        {
           if(enternum == integers[i])
           {
               flag = true;
               break;
           }
           
        }
        if(flag)
        {
            System.out.println("The number is present in the array.");
            
        }
        else
        {
            System.out.println("The number is not present in the array.");
        }
        
                                                    /*number of positive numbers
                                                  number of negative numbers
                                                  number of odd numbers
                                                  number of even numbers
                                                  number of 0’s.*/
        int[] integers2 = new int[20];   
        int positivenum = 0;
        int negativenum = 0;
        int oddnum = 0;
        int evennum = 0;
        int zeronum = 0;
        System.out.println("Enter number: ");
        for(int i = 0; i < 20; i++)
        {
            int input2 = myObj.nextInt();
            integers2[i] = input2;
            if(input2 == 0)
            {
                zeronum += 1;
            }
            if(input2 > 0)
            {
                positivenum += 1;
            }
            if(input2 != 0 && input2 % 2 == 0 )
            {
                evennum += 1;
            }                      
        }
        negativenum = 20 - positivenum - zeronum;
        oddnum = 20 - evennum - zeronum;
        System.out.println("Positive numbers: "+ positivenum);
        System.out.println("Negative numbers: "+ negativenum);
        System.out.println("Odd Numbers: "+ oddnum);
        System.out.println("Even Numbers: "+ evennum);
        System.out.println("Zero numbers: "+ zeronum);
        
        
        
        
    }
    
        
    
    

    

   
}
