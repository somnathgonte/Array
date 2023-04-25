//Adding two matrices.

//Given Matrices: 
//                A : 3  5  9      B : 1  5  2   
//                    7  6  2          6  8  4
//                    4  3  5          3  9  7
//
//Output : 
//               C : 4  10  11
//                   13 14  6
//                   7  12  12


public class Array14 
{
    public static void main(String arg[])
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][] = new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int X[]: C)
        {
            for(int Y :X)
            {
                System.out.print(Y+",");
            }
            System.out.println();
        }
    }
    
}
