// It calculates if the year is a leap year 
// The year has to be given by the user
// A leap year is a year which is divisible by 4
class Year
{
    int year;
    Year()//This constructor is not necessary as it is a default constructor 
    {
        year=0;
    }
    Year(int Year)//Thius constructor is to take input from the user
    {
        year=Year;
    }
    void CalcAndPrint()
    {
        if(year%4==0)// It checks if the year is divisible by 4 or not
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