// This is a program that calculates weekly wages of a person 
// It takes the no. of hr worked and rate from the user
class wages
{
    double hr, rate, ans;
    void init(double H, double R)
    {
        hr=H;
        rate=R;
    }
    void calc_wage()// This is the main method that calculates the weekly wages
    {
        if(hr<=35 && hr>0)//It calculate the wage according to the question
        {
            ans= hr*rate;
        }
        else if(hr>35 && hr<=60)
        {
            double a= (35*rate);
            hr=hr-35;
            ans= a+(hr*rate*1.5);
        }
        else if(hr>60 && hr<=70)
        {
            double a= (35*rate)+(25*rate*1.5);
            hr-=60;
            ans= a+(hr*rate*2);
        }
    }
    void print()//It prints the weekly wages
    {
        System.out.print("The weekly wage is "+ans);
    }
    public static void main()
    {
        wages obj= new wages();
        obj. init(64,1);
        obj. calc_wage();
        obj. print();
    }
}