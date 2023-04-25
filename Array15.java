//Create an integer type array and store elements.Prints only prime elements.

public class Array15
{
    public static void main(String arg[])
    {
        int A[]={3,4,8,7,9,15,17,93,23,29};

        System.out.println("Prime elements are: ");
        for(int i=0; i<A.length;i++)
        {
            int j=0;
            for(j=2; j<=A[i]; j++)
            {
                if(A[i]%j==0)
                {
                    break;
                }
            }
            if(A[i]==j)
            {
                System.out.println(A[i]);
            }
        }
    }
}