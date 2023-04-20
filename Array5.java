//Rotating the elements of given array.(shift left)

public class Array5 
{
    public static void main(String arg[])
    {
        int A[]={11,21,51,101};

        int temp=A[0];

        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        for(int x:A)
        {
          System.out.print(x+",");
        }
    }
}
