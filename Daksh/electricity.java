class electricity
{
    int unit; double amt;
    void accept(int units)
    {
        unit=units;
    }
    void compute()
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
        System.out.println("The bill is Rs "+(amt+500));
    }
}
