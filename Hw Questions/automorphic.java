import java.util.Scanner;
class automorphic
{
    int num,digit,sq,temp1,temp2,temp3,rem,rev,rem1,rev1;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        temp1=temp2=temp3=num;
    }
    void calcDigit()// This method will calculate the number of digit in the no.
    {
        while(temp1!=0)
        {
            temp1=temp1/10;
            digit+=1;
        }
    }
    void squaring()
    {
        sq=temp2*temp2;
    }
    void reverse()
    {
        while(temp2>0)// This is the main step 
        {
            rem=temp2%10;
            rev=(rev*10)+rem;// This finds the reverse of the number
            temp2=temp2/10;
        }
    }
    void calc()
    {
        for(int i=1;i<=digit;i++)
        {
            rem1=sq%10;
            rev1=(rev1*10)+rem1;
            sq=sq/10;
        }
    }
    void chkAndPrint()
    {
        if(rev1==rev)
        {
            System.out.println(num+" is an automorphic number ");
        }
        else 
        {
            System.out.println(num+" is not an automorphic number ");
        }
    }
    public static void main()
    {
        automorphic obj=new automorphic();
        obj.init();
        obj.calcDigit();
        obj.squaring();
        obj.reverse();
        obj.calc();
        obj.chkAndPrint();
    }
}