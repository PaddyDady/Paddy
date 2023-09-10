public class LabelDemo 
{
    public static void main(String[] args) 
    {
       int i,j;
       
       outer:
       for(i=1;i<=12;i++)
        {
            System.out.println("HELLO "+i);
            for(j=1;i<11;j++)
            {
                if(j>5)
                    break outer;
                    System.out.println(""+j);
            }
        }
        System.out.println("LOOP IS TERMINATED");
    }
}
