//Finding maximum element of an array

public class Array4 
{
    public static void main(String arg[])
    {
        int A[]={3,9,7,8,120,6,16,5,4,10};
        int max=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }
        System.out.println(max); 
    }
}
