import java.util.Scanner;
class pattern7
{
    int n,count;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        n=sc.nextInt();
        count=1;
    }
    void loop()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern7 obj=new pattern7();
        obj.init();
        obj.loop();
    }
}
