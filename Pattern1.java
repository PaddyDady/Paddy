import java.util.Scanner;

public class Pattern1 
{
  public static void main(String[] args) 

  {
    int i,j,r;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the no. of rows ");
    r=sc.nextInt();
        for( i=1;i<=r;i++)
        {
            for( j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for ( i=r-1; i>=1;i--)
        {
            for ( j=1;j<=i;j++)
            {
                System.out.print(i);

            }
            System.out.println();
        }
  }  
}
