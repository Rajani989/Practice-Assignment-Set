/* Write a java program that prints the numbersFROM 1 to 100. for multiples of three, print "Fizz"
instead of the number and for multiples of five, print "Buzz" 
For numbers which are multiples of both three and five, print "FizzBuzz". */

public class FizzBuzz 
{
    public static void main(String[] args)
    {
       for(int i=1;i<=100;i++)
       {
           if(i%3==0 && i%5==0)  //if i is multiple of 3 and 5 then print FizzBuzz
           {
                System.out.println("FizzBuzz");
           }
           else if(i%5==0) //if i is multiple of 5 then print Buzz
           {
                System.out.println("Buzz");
           }
           else if(i%3==0 ) //if i is multiple of 3 then print Fizz
           {
                System.out.println("Fizz");
           }
           else
           {
                System.out.println(i);
           }
            
       }
    }
}
