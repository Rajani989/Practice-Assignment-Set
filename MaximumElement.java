/* Find maximum element in an array. Write a java program that takes an integer array as input and finds the maximum element in that array.  */

import java.util.Scanner;

public class MaximumElement
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int size=sc.nextInt();  // taking input the size from scanner
       int array[]= new int[size];
     
       for(int i=0;i<size;i++) //Loop for taking input of array
       {
           array[i]=sc.nextInt();
       }
       
       int max=array[0];
       for(int i=1;i<size;i++) //Loop for finding maximum element
       {
           if(array[i]>max)
           {
               max=array[i];
           }
       }
           System.out.println("Maximum value: "+max);       //print Greater element value   
    }
}
