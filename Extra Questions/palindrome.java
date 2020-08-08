//This program will find if the given number is an palindrome number or not by using scanner class
//Palindrome number is that number whose reverse is equal to the original number
import java.util.Scanner;
class palindrome
{
    int num, temp1, rev, rem, i;
    void init()
    {
        System.out.print("Input a Number ");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    void initialise()
    {
        temp1=num;
        rem=0;
    }
    void reverse()//This finds the reverse of the original number
    {
        while(temp1!=0)
        {
            rem=temp1%10;
            rev=rev*10+rem;
            temp1/=10;
        }
    }
    void print()//It prints the original number and the reverse number and i they both are equal then it also prints that the number is a palindrome number
    {
        System.out.println("The Original Number is "+num);
        System.out.println("Reverse of this number is "+rev);
        if(num==rev)
        {
            System.out.println("Therfore this no. is an Palindrome No. ");
        }
        else
        {
            System.out.println("Therfore this no. is not an Palindrome No. ");
         }
    }
    public static void main()
    {
        palindrome obj=new palindrome();
        obj.init();
        obj.input();
        obj.initialise();
        obj.reverse();
        obj.print();
    }
}