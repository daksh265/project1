//This program will find if the given number is an armstrong number or not by using scanner class
//Armstrong number is that number whose sum of digit (each digitt raised to the power of no of digit present in that number)
import java.util.Scanner;
class armstrong1
{
    int num; int temp1; int temp2; int digit; int i; int rev; double rem;
    void input()
    {
        System.out.print("Input a number: ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
    }
    void give_input()//This is to give the input to the instance variable
    {
        temp1=num;
        temp2=num;
        digit=0;
    }
    void digit_calc()// This method will calculate the number of digit in the no.
    {
        while(temp1!=0)
        {
            temp1/=10;
            digit+=1;
        }
    }
    void main_calc()//This method will calcutate the sum of digit (each digitt raised to the power of no of digit present in that number)
    {
        for(i=1;i<=digit;i++)
        {
            rev=temp2%10;
            rem+=Math.pow(rev,digit);
            temp2/=10;
        }
    }
    void print()//This method will print the original number and numberr found from calculation
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
       obj.input();
       obj.give_input();
       obj.digit_calc();
       obj.main_calc();
       obj.print();
    }
}