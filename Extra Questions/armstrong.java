//This program will find if the given number is an armstrong number or not 
//Armstrong number is that number whose sum of digit (each digitt raised to the power of no of digit present in that number)
class armstrong
{
    int no; int temp1; int temp2; int digit; int i; int rev; int rem;
    void init(int number)
    {
        no=number;
        temp1=number;
        temp2=number;
        digit=0;
    }
    void calcDigit()// This method will calculate the number of digit in the no.
    {
         while(temp1!=0)
        {
            temp1=temp1/10;
            digit+=1;
        }
    }
    void maincalc()//This method will calcutate the sum of digit (each digitt raised to the power of no of digit present in that number)
    {
        for(i=1;i<=digit;i++)
        {
            rev=0;
            rev=temp2%10;
            rem+=Math.pow(rev,digit);
            temp2=temp2/10;
        }
    }
    void print()
    {
        System.out.println("The Original Number is "+no);
        System.out.println("The Number Found from Calculation is "+rem);
        if(no==rem)//This will find if thee number is armstrong no. or not
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
       armstrong obj= new armstrong(); 
       obj. init(407);
       obj. calcDigit();
       obj. maincalc();
       obj. print();
    }
} 