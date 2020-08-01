import java.util.Scanner;
class scan1
{
    int num;
    void input()
    {
        System.out.print("Input a No. ");
    }
    void init()
    {
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
    }
    void print()
    {
        System.out.println("The Number is "+num);
    }
    public static void main()
    {
        scan1 obj= new scan1();
        obj.input();
        obj.init();
        obj.print();
    }
}