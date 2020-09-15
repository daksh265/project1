import java.util.Scanner;
class pattern3
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
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern3 obj=new pattern3();
        obj.init();
        obj.loop();
    }
}

