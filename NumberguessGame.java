import java.util.Random;
import java.util.Scanner;
class NumberguessGame
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        System.out.println("Welcome to Number Guessing Game ");
        System.out.println("You haveto guess a Number to win the game ");
        System.out.println("You have maximum 5 attempt limit");
        Scanner scan=new Scanner(System.in);
		//generate random number using random function
        Random randomnum=new Random();
        int num=randomnum.nextInt(100);		//It gives random umber between 1 to 100
        int counter=0;
        //For loop is used to maintain the attempt 
        for(int increment=4;increment>=0;increment--)
        {
            System.out.println("Enter any No = ");
            int inputNum=scan.nextInt();
            if(inputNum==num)
            {
                System.out.println("You win the Game"+increment+"th attempt");
                counter=1;
                break;
            }
            else if (inputNum<num)
            {
                System.out.println("Your guessed number is Smaller than actual number");
                System.out.println (increment+" Attempt are remained");
            }
            else
            {
                System.out.println("your guessed number is Greater Than actual number");
                System.out.println (increment+" Attempt are remained");
            }
        
        }
        if(counter!=1)
        {
            System.out.println("Sorry !....You loss the game");
        }
    }
}