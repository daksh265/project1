//This program calculates the bill to be paid for using cyber cafe
//It take the time used by the costomer as the input from the user
class bill
{
    double bill; int used;
    void init(int usage)
    {
        used=usage;
    }
    void generate() //The bill depends on the time used by the user
    {
        if(used>0 && used<=60)
        {
            bill=20;
        }
        else if(used>60 && used<=90)
        {
            bill=20+12;
        }
        else if(used>90 && used<=105)
        {
            bill=20+12+8;
        }
        else
        {
            bill=(20+12+8)+((used-105)*2);
        }
    }
    void print()
    {
        System.out.println("The amount to be paid is "+bill);
    }
    public static void main(int time_used)
    {
        bill obj=new bill();
        obj. init(time_used);
        obj. generate();
        obj. print();
    }
}