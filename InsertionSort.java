import java.util.Scanner;
class InsertionSort
{
 public static void main(String args[])
 { 
  int n,c,d,swap;
  Scanner in =new Scanner(System.in);
  System.out.println("input number of integers to sort");
  n=in.nextInt();
  int array[]=new int[n];
  System.out.println( "enter"+n+"integers");
  for(c=0;c<n;c++)
    array[c]=in.nextInt();
 for(c=1;c<=n-1;c++)
 {
  d=c;
  while(d>0&&array[d]<array[d-1])
  {
    swap=array[d];
    array[d]=array[d-1];
    array[d-1]=swap;
    d--;
  }
  System.out.println("sorted list of numbers");
  for(c=0;c<n;c++)
     System.out.println(array[c]);
}
}
}