import java.util.Scanner;
class MenuDriven3
{
    int num,digit,sq,temp1,temp2,temp3,rem,rev,rem1,rev1,number,i,n=0;
    void ask()
    {
        System.out.println("What would you like to do ");
        System.out.println("1.Check if the number is  a prime number ");
        System.out.println("2.Check if the number is  an automorphic number ");
        System.out.println("Press any integer other than 1/2 to exit the program ");
    }
    void chk_Prime_number()//It is for checking if the number is prime or not
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                n+=1;
            }
        }
        if(n==0)
        {
            System.out.println("The number is a prime number ");
        }
        else
        {
            System.out.println("The number is not a prime number ");
        }
    }
    //From here the calculation for automorphic number starts
    void init()//For initiallisation of the numbers
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
    void squaring()//for squaring the number
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
            System.out.println("The number is an automorphic number ");
        }
        else 
        {
            System.out.println("The number is not an automorphic number ");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        MenuDriven3 obj=new MenuDriven3();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter your selection [1/2] ");
            opt=sc.nextInt();
            if(opt==1)//for finding the area of the shapes 
            {
                obj.chk_Prime_number();//If yes than it will find the area of circle
            }
            else if(opt==2)//for finding the area of the shapes 
            {
                obj.init();
                obj.calcDigit();
                obj.squaring();
                obj.reverse();
                obj.calc();
                obj.chkAndPrint();
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