//Finding sum of all elements

public class Array2
{
    public static void main(String arg[])
    {
        int A[]={3,9,7,8,12,6,16,5,4,10};
        int sum = 0;

        // for(int i=0;i<A.length;i++)    for loop
        // {
        //     sum = sum + A[i];
        // }

        //Or

        for(int x:A)  //For each loop
        {
            sum = sum+x;
        }
        System.out.println(sum);
    }
}