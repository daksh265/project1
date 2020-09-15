import java.util.Scanner;
class average
{
    int no; double stu,sum,avg;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Students ");
        no=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=no;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the mark of student ");
            stu=sc.nextDouble();
            sum+=stu;
        }
    }
    void calc_avg()
    {
        avg=sum/no;
    }
    void print()
    {
        System.out.println("The avgerage marks of all students is "+avg);
    }
    public static void main()
    {
        average obj=new average();
        obj.init();
        obj.calc();
        obj.calc_avg();
        obj.print();
    }
}
