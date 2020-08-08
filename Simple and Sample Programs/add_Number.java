//This a basic and a simple program that adds 2 numbers
class add_Number
{
    double no1, no2,sum;
    add_Number(double n1, double n2)
    {
        no1=n1;
        no2=n2;   
    }
    void calc()
    {
        sum=no1+no2;
    }
    void print()
    {
        System.out.println("The sum of 2 numbers is "+sum);
    }
    public static void main()
    {
        add_Number add =new add_Number(783,217);
        add.calc();
        add.print();
    }
}