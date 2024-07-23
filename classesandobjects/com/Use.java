package classesandobjects.com;

class Rectangle
{
    int length;
    int width;

    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    void area()
    {
        System.out.println("Area:"+length*width);
    }
    void perimeter()
    {
        System.out.println("Perimeter:"+2*(length+width));
    }
}
public class Use {

    public static void main(String [] args)
    {
        Rectangle rec=new Rectangle(10,20);
        rec.area();
        rec.perimeter();
    }
}
