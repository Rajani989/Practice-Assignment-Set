/* Write a java program that accepts a string from the user and prints the reverse of that string.  */

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter a String: ");
       String str=sc.nextLine();  // taking input from scanner
       String revstr="";
       for(int i=str.length()-1;i>=0;i--) //Loop for reversing thr string
       {
           revstr += str.charAt(i);
       }
      
            System.out.println("Original String: " +str);  //print original string value
            
           System.out.println("Reverse String: "+revstr); //print reverse String value  
    }
}
