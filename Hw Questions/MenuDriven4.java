import java.util.Scanner;
class MenuDriven4
{
    void ask()
    {
        System.out.println("What would you like to do ");
        System.out.println("1.Check if the number is  a palindrome number ");
        System.out.println("2.Check if the number is  an perfect number ");
        System.out.println("Press any integer other than 1/2 to exit the program ");
    }
    //From here we will continue to check if it is perfect number
    void perfect_number()
    {
        Scanner sc=new Scanner(System.in);
        int num,n,i,sum;
        System.out.print("Input a number: ");
        num=sc.nextInt();
        n=num;
        sum=1;//This will include 1 in all the numbers
        for(i=2;i<n;i++)
        {
            if(n%i==0)//This loop will add the facors
            {
                sum+=i;
            }
        }
        System.out.println("The Original Number is "+num);
        System.out.println("Sum of the factors of number is "+sum);
        if(sum==num)//This will check if the sum is equal to the original number
        {
            System.out.println("The number is Perfect Number");
        }
        else//else it will print not a perfect number
        {
            System.out.println("The number is not a perfect number");
        }
    }
    //From here we will continue to check if it is palindrome number
    void palindrome_number()
    {
        int num, temp1, rev, rem, i;
        System.out.print("Input a Number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp1=num;
        rev=0;
        while(temp1!=0)
        {
            rem=temp1%10;
            rev=rev*10+rem;
            temp1/=10;
        }
        System.out.println("The Original Number is "+num);
        System.out.println("Reverse of this number is "+rev);
        if(num==rev)
        {
            System.out.println("The no. is an Palindrome No. ");
        }
        else
        {
            System.out.println("The no. is not an Palindrome No. ");
         }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        MenuDriven4 obj=new MenuDriven4();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter your selection [1/2] ");
            opt=sc.nextInt();
            if(opt==1)//for finding the area of the shapes 
            {
                obj.palindrome_number();//If yes than it will find the area of circle
            }
            else if(opt==2)//for finding the area of the shapes 
            {
                obj.perfect_number();
            }
            else
            {
                return;//This is a return statement
            }
            System.out.println("Do you want to continue [y/n] ");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}