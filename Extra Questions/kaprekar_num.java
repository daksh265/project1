import java.util.*;
class kaprekar_num
{
    int num,sq,temp1,left,right;
    static int digit;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        temp1=num;
    }
    void square()
    {
        sq=(int)Math.pow(temp1,2);
        System.out.println(num+" square is "+sq);
    }
    void digits()
    {
        for(int i=sq;i>0;i=i/10)
        {
            digit+=1;
        }
    }
    void split()
    {
        left=sq%(int)Math.pow(10,digit/2);
        right=sq/(int)Math.pow(10,digit/2);
        System.out.println("First part "+right);
        System.out.println("last part "+left);
        System.out.println("The sum of both the parts are "+(left+right));
    }
    void chk()
    {
        if((left+right)==num)
        {
            System.out.println("The sum is equal to the number entered");
            System.out.println("Therefore, "+num+" is a kaprekar number");
        }
        else
        {
            System.out.println("The sum is not equal to the number entered");
            System.out.println("Therefore, "+num+" is not a kaprekar number");
        }
    }
    public static void main()
    {
        kaprekar_num obj=new kaprekar_num();
        obj.init();
        obj.square();
        obj.digits();
        if(digit%2!=0)
        {
            System.out.println("The number of digit should be even");
            return;
        }
        else
        {
            obj.split();
            obj.chk();
        }
    }
}