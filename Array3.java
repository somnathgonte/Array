// Searching the elements from given array.

import java.util.*;
public class Array3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int A[]={3,9,7,8,12,6,16,5,4,10};
        System.out.println("Enter number: ");
        
        int number = sc.nextInt();

        for(int i=0; i<A.length; i++)
        {
            if(A[i]==number)
            {
                System.out.println(i);
                System.exit(0);  //System.exit(0) is use for stop the program.
            }
        }
        System.out.println("Not found");
    }
}