import java.util.Scanner;

public class CircleDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value\t");
        float radius = sc.nextFloat();
        final float pi = 3.14f;
        float area = pi*radius*radius;
        System.out.println("Area of the circle is\t"+area); 
    }
}
