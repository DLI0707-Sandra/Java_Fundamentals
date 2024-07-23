package Basics.com;

import java.util.Random;
import java.util.Scanner;

public class Flip
{
    public static void main(String[] args)
    {
        int tails_count=0;
        int heads_count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times the coin needs to be flipped:");
        int number=sc.nextInt();
        for(int i=0;i<number;i++)
        {
            Random ro=new Random();
            double result=ro.nextDouble(1);
//            double result=Math.random();
//            System.out.println(result);
            if(result<0.5)
            {
                tails_count++;
//                System.out.println(tails_count);
            }
            else
            {
                heads_count++;
//                System.out.println(heads_count);
            }
        }
        System.out.println("Percentage of Tails:"+(((double)tails_count/number)*100));
        System.out.println("Percentage of Heads:"+(((double)heads_count/number)*100));
    }

}
