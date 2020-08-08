// This is a program to calculate the commision of the salesman
class P7
{
    double amt; double ans;
    void init( double sale)
    {
        amt=sale;
    }
    void Display_commission()
    {
        System.out.println("The sale is "+amt);
        if(amt>=50000)
        {
            ans=(10*amt)/100;  // 10% of the sale (amt)
            System.out.println("The Commision of the salesman is "+ans);
        }
        else if(amt<=50000 && amt>=10000)
        {
            ans=(8*amt)/100;  // 8% of the sale (amt)
            System.out.println("The Commision of the salesman is "+ans);
        }
        else
        {
            ans=(5*amt)/100;  // 5% of the sale (amt)
            System.out.println("The Commision of the salesman is "+ans);
        }
    }
    public static void main(double Sale)
    {
        P7 obj=new P7();
        obj. init(Sale);
        obj. Display_commission();
    }
}
