//Coping an array into another array.

public class Array7 
{
    public static void main(String arg[])
    {
        int A[]={11,21,51,101};
        int B[]=new int[4];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for(int x:B)
        {
            System.out.print(x+",");
        }
    }
    
}
