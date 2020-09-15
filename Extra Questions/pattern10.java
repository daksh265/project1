import java.util.Scanner;
class pattern10
{
    int n;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n=sc.nextInt();
    }
    void loop()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n-(j-1)+" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(n-(i-1)+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern10 obj=new pattern10();
        obj.init();
        obj.loop();
    }
}