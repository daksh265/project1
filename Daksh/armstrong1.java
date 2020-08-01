import java.util.Scanner;
class armstrong1
{
    int num; int temp1; int temp2; int digit; int i; int rev; double rem;
    void init()
    {
        System.out.print("Input a number: ");
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
    }
    void give_input()
    {
        temp1=num;
        temp2=num;
        digit=0;
    }
    void digit_calc()
    {
        while(temp1!=0)
        {
            temp1/=10;
            digit+=1;
        }
    }
    void main_calc()
    {
        for(i=1;i<=digit;i++)
        {
            rev=temp2%10;
            rem+=Math.pow(rev,digit);
            temp2/=10;
        }
    }
    void print()
    {
        System.out.println("The Original Number is "+num);
        System.out.println("The Number Found from Calculation is "+rem);
        if(num==rem)
        {
            System.out.println("Therfore this no. is an Armstrong No. ");
        }
        else
        {
            System.out.println("Therfore this no. is not an Armstrong No. ");
        }
    }
    public static void main()
    {
       armstrong1 obj= new armstrong1(); 
       obj.init();
       obj.input();
       obj.give_input();
       obj.digit_calc();
       obj.main_calc();
       obj.print();
    }
}