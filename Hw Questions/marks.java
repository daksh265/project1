import java.util.Scanner;
class marks
{
    int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10; double avg;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of 1st student ");
        s1=sc.nextInt();
        System.out.print("Enter the marks of 2nd student ");
        s2=sc.nextInt();
        System.out.print("Enter the marks of 3rd student ");
        s3=sc.nextInt();
        System.out.print("Enter the marks of 4th student ");
        s4=sc.nextInt();
        System.out.print("Enter the marks of 5th student ");
        s5=sc.nextInt();
        System.out.print("Enter the marks of 6th student ");
        s6=sc.nextInt();
        System.out.print("Enter the marks of 7th student ");
        s7=sc.nextInt();
        System.out.print("Enter the marks of 8th student ");
        s8=sc.nextInt();
        System.out.print("Enter the marks of 9th student ");
        s9=sc.nextInt();
        System.out.print("Enter the marks of 10th student ");
        s10=sc.nextInt();
    }
    void calc()
    {
        avg=(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10)/10;
    }
    void print()
    {
        System.out.println("The average marks of 10 students are "+avg);
    }
    public static void main()
    {
        marks obj=new marks();
        obj.input();
        obj.calc();
        obj.print();
    }
}