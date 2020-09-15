import java.util.Scanner;
class pattern8
{
    int n,count,num;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        n=sc.nextInt();
        num=1;
    }
    void loop()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print((num++)+" ");
                    count=num;
                }
                else
                {
                    System.out.print((count++)+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern8 obj=new pattern8();
        obj.init();
        obj.loop();
    }
}
