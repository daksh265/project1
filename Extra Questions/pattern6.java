import java.util.Scanner;
class pattern6
{
    int n;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        n=sc.nextInt();
    }
    void loop()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-(i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern6 obj=new pattern6();
        obj.init();
        obj.loop();
    }
}
