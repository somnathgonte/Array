//Jagged Array.(Using for loop)

public class Array12 
{
    public static void main(String arg[])
    {
        int A[][];
        A=new int[3][];

        A[0]= new int[5];
        A[1]= new int[8];
        A[2]= new int[3];

        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[i].length; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
