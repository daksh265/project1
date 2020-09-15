import java.util.Scanner;
class pattern9
{
    int n,num,count;char a;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows ");
        n=sc.nextInt();
        num=97;
    }
    void loop()
    {
        for(int i=97;i<=(n+96);i++)
        {
            for(int j=97;j<=i;j++)
            {
                if(i%2==0)
                {
                    a=(char)i;
                    System.out.print(a+" ");
                }
                else
                {
                    a=(char)i;
                    System.out.print(Character.toUpperCase(a)+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern9 obj=new pattern9();
        obj.init();
        obj.loop();
    }
}
