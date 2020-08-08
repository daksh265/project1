//This program calculates the electricity bill of the user 
//It takes the unit used by the user and calculates and print the bill
class electricity
{
    int unit; double amt;
    void accept(int units)
    {
        unit=units;
    }
    void compute()//The amt of the bill depends on the units used by the user
    {
        if(unit>0 && unit<=100)
        {
            amt=(unit*40)/100;
        }
        else if(unit>100 && unit<=300)
        {
            amt=((100*40)/100)+((unit-100)*60)/100;
        }
        else 
        {
            amt=((100*40)/100)+((200*60)/100)+((unit-300)*1);
        }
    }
    void print_the_bill()
    {
        System.out.println("The bill is Rs "+(amt+500));//Rs 500 is added for all user is a rent 
    }
    public static void main()
    {
        electricity obj=new electricity();
        obj.accept(100);
        obj.compute();
        obj.print_the_bill();
    }
}
