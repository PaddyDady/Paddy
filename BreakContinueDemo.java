public class BreakContinueDemo 
{
   public static void main(String[] args) 
   {
    //BREAK DEMO
        for (int i=1;i<10;i++)
        {
            if (i==5)
                 break;
                System.out.println(i);
        }
        System.out.println("CONTINUE DEMO");
     //CONTINUE DEMO\
        for (int i=1;i<=10;i++)
        {
            if(i==5)
                continue;
                System.out.println(i);
        }

   } 
}
