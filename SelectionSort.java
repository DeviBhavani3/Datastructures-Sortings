import java.util.Scanner;
class SelectionSort
{
    public static void main(String[]args)
    {
        int n,c,d,p,swap;
        Scanner in=new Scanner(System.in);
        System.out.println("input number of integer to sort");
        n=in.nextInt();
        int array[]=new int[n];
        System.out.println("enter"+n+"integer");
        for (c=0;c=n-1;c++)
           array[c]=in.nextInt();
        for(c=0;c<n-1;c++)
        {
            p=c;
            for(d=c+1;d<n;d++)
            {
                if(array[p]>array[d])
                {
                    p=d;
                }
            }
            if(p!=c)
            {
                swap=array[c];
                array[c]=array[p];
                array[p]=swap;

            }
        }
        System.out.println("sorted list of number");
        for(c=0;c<n;c++)
        System.out.println(array[c]);
    }
}