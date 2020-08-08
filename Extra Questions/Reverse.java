// This program prints the reverse of the no given by the user
class Reverse
{
    int no; int rev; int rem;
    Reverse()//This is a default constructor 
    {
        no=0;
    }
    Reverse(int number)//This is a constructor that provides the input from the user
    {
        no=number;
        rev=0;
    }
    void find_reverse()
    {
        while(no>0)// This is the main step 
        {
            rem=no%10;
            rev=(rev*10)+rem;// This finds the reverse of the number
            no=no/10;
        }
    }
     void print()//This method prints the reversed no
    {
        System.out.println("The Reverse of the number is "+rev);
    }
    public static void main()
    {
        Reverse R1=new Reverse();
        Reverse R2=new Reverse(1753);
        R2.find_reverse();
        R2.print();
    }
}
