class Year
{
    int year;
    Year()
    {
        year=0;
    }
    Year(int Year)
    {
        year=Year;
    }
    void CalcAndPrint()
    {
        if(year%4==0)
        {
            System.out.println(year+" is a Leap Year");
        }
        else 
        {
            System.out.println(year+" is not a Leap year");
        }
    }
    public static void main()
    {
        Year Y1=new Year();
        Year Y2=new Year(2005);
        Y2.CalcAndPrint();
    }
}