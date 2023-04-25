//Jagged array (Using for each loop)

public class Array13 
{
    public static void main(String arg[])
    {
        int A[][];
        A=new int[3][];

        A[0]=new int[5];
        A[1]=new int[8];
        A[2]=new int[3];

        for(int X[] : A)
        {
            for(int Y : X)
            {
                System.out.print(Y+" ");
            }
            System.out.println();
        }
    }
    
}
