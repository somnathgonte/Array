//Display all the elements of given array.
public class Array
{
    public static void main(String []arg)
    {
        int a[]={11,21,51,101,151};
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //Or
        for(float x:a)
        {
            System.out.println(x);
        }
    }
}
