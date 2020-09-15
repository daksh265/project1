import java.util.Scanner;
class perfect_number
{
    int num,n,i,sum;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        n=num;
        sum=1;
    }
    void calc()
    {
        for(i=2;i<n;i++)//This loop will exclude 1 to add in prime factors
        {
            if(n%i==0)//This loop will do the prime factorization
            {
                sum+=i;
            }
        }
    }
    void chk_print()
    {
        if(sum==num)
        {
            System.out.println("The number is Perfect Number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }
    }
    public static void main()
    {
        perfect_number obj=new perfect_number();
        obj.init();
        obj.calc();
        obj.chk_print();
    }
}
