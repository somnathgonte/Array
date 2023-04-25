//Display 2D array.(using for each loop).

public class Array11 
{
    public static void main(String arg[])
    {
        int A[][]={{1,2,3},{2,4,6},{1,3,5}};

        for(int X[] : A)
        {
            for(int Y : X)
            {
                System.out.print(Y+" ");
            }
            System.out.println("");
        }
    }
}
