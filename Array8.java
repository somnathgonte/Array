//Copying reversing an array.
// example: A[]={11,21,51,101};
// Output:  B[]={101,51,21,11};

public class Array8 
{
    public static void main(String arg[])
    {
        int A[]={11,21,51,101};
        int B[]=new int[4];

        for(int i=A.length-1,j=0; i>=0; i--,j++)
        {
            B[j]=A[i];
        }

        for(int X:B)
        {
            System.out.print(X+",");
        }
    }
    
}
