import java.util.Scanner;
class toWord
{
    char ch;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character in number ");
        ch=sc.next().charAt(0);
    }
    void convert()
    {
        switch(ch)
        {
            case '0':
            System.out.println("In words Zero");
            break;
            case '1':
            System.out.println("In words One");
            break;
            case '2':
            System.out.println("In words Two");
            break;
            case '3':
            System.out.println("In words Three");
            break;
            case '4':
            System.out.println("In words Four");
            break;
            case '5':
            System.out.println("In words Five");
            break;
            case '6':
            System.out.println("In words Six");
            break;
            case '7':
            System.out.println("In words Seven");
            break;
            case '8':
            System.out.println("In words Eight");
            break;
            case '9':
            System.out.println("In words Nine");
            break;
            default:
            System.out.printf("Not a number ");
        }
    }
    public static void main()
    {
        toWord obj=new toWord();
        obj.init();
        obj.convert();
    }
}
