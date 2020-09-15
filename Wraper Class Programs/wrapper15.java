import java.util.Scanner;
class wrapper15
{
    char a,b; boolean i;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character ");
        a=(sc.next()).charAt(0);
    }
    void calc()
    {
        if(Character.isLowerCase(a))
        {
            b=Character.toUpperCase(a);
            System.out.println("In upper case "+b);
        }
        else if(i=Character.isUpperCase(a))
        {
            b=Character.toLowerCase(a);
            System.out.println("In lower case "+b);
        }
        else
        {
            System.out.println("It is a special character");
        }
    }
    public static void main()
    {
        wrapper15 obj=new wrapper15();
        obj. init();
        obj. calc();
    }
}
