package Basics.com;

public class Defaultprim
{
    byte byte_var;
    short short_var;
    int int_var;
    long long_var;
    float float_var;
    double double_var;
    boolean bool_var;
    char char_var;
    public static void main(String[]args)
    {
        Defaultprim defaults = new Defaultprim();
        System.out.println("Default value of boolean:"+defaults.bool_var);
        System.out.println("Default value of byte:"+defaults.byte_var);
        System.out.println("Default value of short:"+defaults.short_var);
        System.out.println("Default value of int:"+defaults.int_var);
        System.out.println("Default value of long:"+defaults.long_var);
        System.out.println("Default value of float:"+defaults.float_var);
        System.out.println("Default value of double:"+defaults.double_var);
        System.out.println("Default value of char:"+defaults.char_var);
    }

}
