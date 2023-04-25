//Rotating the elements of given array.(shift right)
// A[]={11,21,51,101}
//After rotating to right: A[]={101,11,21,51}

public class Array6
{
    public static void main(String arg[])
    {
        int A[]={11,21,51,101};

        int temp=A[A.length-1];

        for(int i=A.length-2;i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;

        for(int x:A)
        {
          System.out.print(x+",");
        }
    }
}
