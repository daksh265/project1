import java.util.Scanner;
class First_plus_Last
{
    int num,temp1,temp2,sum;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp1=num;
        temp2=num;
    }
    void first()
    {
        sum=temp1%10;
    }
    void last()
    {
        while(temp2!=0)
        {
            temp2/=10;
            if(temp2>=1 && temp2<=9)
            {
                sum+=temp2;
            }
        }
    }
    void print()
    {
        System.out.println(sum);
    }
    public static void main()
    {
        First_plus_Last obj=new First_plus_Last();
        obj.input();
        obj.first();
        obj.last();
        obj.print();
    }
}