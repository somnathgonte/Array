//2D array.(using for loop).

public class Array10 
{
    public static void main(String arg[])
    {
        int A[][]={{1,2,3},{2,4,6},{1,3,5}};

        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
