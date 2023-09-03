public class TypeCasting
{
 public static void main(String[] args)
  {
    //Implicit Type Casting [Lower to Higher]
    int a,b;
    a=100;
    b=700;
    double a1,b1,div;
    a1=a;
    b1=b;
    div=a1/b1;
    System.out.println(div);


    //Explicit Type Casting [Higher to Lower ]
    float p=100.5f;
    int sum =(int)a+5;
    System.out.println(sum); 
 }   
}
