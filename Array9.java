//Increasing size of an array.

public class Array9 
{
    public static void main(String arg[])
    {
        int A[]={11,21,51,101};
        System.out.println("Length of A :"+A.length);
        int B[]=new int[2*A.length];

        for(int i=0; i<A.length; i++)
        {
            B[i]=A[i];
        }

        A=B;

        System.out.println("Length of A :"+A.length);
    }
}
