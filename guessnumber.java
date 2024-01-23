import java.util.*;
import java.lang.Math;
class guessnumber{
    public static void main(){
        int guess,c=5,ranom,i;
        char ch;
        while(true)
        {
            System.out.println("----Guess The Number Game----");
            System.out.println("You have 5 chances to play the game");
            System.out.println("Enter Y to play the game");
            System.out.println("Enter N to exit the game");
            Scanner sc=new Scanner(System.in);
            ch=sc.next().charAt(0);
            System.out.println("------------------------------------");
            switch(ch)
            {
                case 'Y':
                    ranom=(int)(Math.random() * 100);
                    for(i=1;i<=5;i++)
                    {
                        System.out.println("Chance Number:"+i);
                        System.out.println("Enter your guess number between 1 to 100:");
                        guess=sc.nextInt();
                        if(guess<ranom)
                        {
                            System.out.println("My number is greater than your Number");
                              System.out.println("------------------------------------");
                            if(i==5)
                            {
                            System.out.println("Better luck next time!");
                             System.out.println("------------------------------------");
                            }
                        }
                        else
                        if(guess>ranom)
                        {
                            System.out.println("My number is less than your number");
                             System.out.println("------------------------------------");
                            if(i==5)
                            {
                            System.out.println("Better luck next time!");
                             System.out.println("------------------------------------");
                            }
                        }
                        else
                        
                        {
                            System.out.println("Congratulations! You have guessed it right");
                             System.out.println("------------------------------------");
                            System.exit(0);
                        }
                    }
                    break;
                    case 'N':
                        {
                        System.out.println("---exiting---");
                        System.exit(0);
                        }
                        break;
                        default:
                        System.out.println("Invalid choice"); 
            }
        }
        
        
    }
}