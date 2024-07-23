package Basics.com;

public class Power
{
    public static void main(String[] args)
    {
        int limit=Integer.parseInt(args[0]);
        System.out.println("Powers of 2");
        for(int i=0;i<=limit;i++)
        {
            System.out.println("2^"+i+":"+Math.pow(2,i));
        }
    }
}
