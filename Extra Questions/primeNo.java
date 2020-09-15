//This program is for checking if the entered value is prime number
import java.util.Scanner;
class primeNo
{
    int no,i,ans;
    void init()
    {
        ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        no=sc.nextInt();
    }
    void calc()
    {
        for(i=2;i<no;i++)//i cannot be 1 because 1 is divisible by any number
        {
            if(no%i==0)
            {
                ans+=1;
            }
        }
    }
    void chk_and_print()
    {
        if(ans==0)
        {
            System.out.println("The number is a prime number");
        }
        else 
        {
            System.out.println("The number is not a prime number");
        }
    }
    public static void main()
    {
        primeNo obj=new primeNo();
        obj.init();
        obj.calc();
        obj.chk_and_print();
    }
}