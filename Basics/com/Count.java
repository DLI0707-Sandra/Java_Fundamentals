package Basics.com;

public class Count {

    public static void main(String [] args)
    {
        String sentence="How are you";

        int count_char=0;
        int count_word=0;
        String [] words=sentence.split(" ");
        System.out.println(words.length);
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)>='a'&&sentence.charAt(i)<='z'||sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z')
            {
                count_char++;
            }
        }

        System.out.println(count_char);
    }
}
