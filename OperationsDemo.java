public class OperationsDemo
{
    float result=0;
    
    float sum()
    {
        int a,b;
        a=10;
        b=20;
        result=a+b;
        return result;
    }
    float div()
    {
        float a,b;
        a=10;
        b=20;
        result=a/b;
        return result;
    }
    public static void main(String[] args)
     {
        OperationsDemo op = new OperationsDemo();
         System.out.println("sum is "+op.sum());
         System.out.println("div is "+op.div());
    }
    {
       
    }
    
}
