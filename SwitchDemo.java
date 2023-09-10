import java.util.Scanner;

public class SwitchDemo
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grettings");
        String type = sc.nextLine();
        System.out.println("Enter Time AM, PM, NOON");
        String time = sc.nextLine();
        switch (type)
        {
            case "Good morning":
                System.out.println("Good morning");
                switch (time) 
                {
                    case "AM":
                        System.out.println("AM valid time");
                        break;
                
                    default:
                        System.out.println("Not valid time ");
                        break;
                }
                break;
            case "Good Afternoon":
                System.out.println("Good afternoon");
                switch (time)
                {
                    case "NOON":
                    System.out.println("Noon valid time");
                        break;
                default:
                    System.out.println("Good Afternoon");
                    break;
                }
                break;
            case "Good evening":
                System.out.println("Good evening");
                switch (time) 
                {
                    case "PM":
                    System.out.println("PM valid time");
                        break;
                
                    default:
                    System.out.println("Not valid");
                        break;
                }
                break;
                default:
                System.out.println("Your input not match");
            
            

        }
   }
} 

