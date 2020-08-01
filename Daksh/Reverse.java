class Reverse
{
    int no; int rev; int rem;
    Reverse()
    {
        no=0;
    }
    Reverse(int number)
    {
        no=number;
        rev=0;
    }
    void find_reverse()
    {
        while(no>0)
        {
            rem=no%10;
            rev=(rev*10)+rem;
            no=no/10;
        }
    }
     void print()
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
