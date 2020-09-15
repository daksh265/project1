//This is a program that prints the answer for a series
//The series is 1,4,7,10 till 25 terms
class series8
{
    int sum,no;
    void calc()
    {
        for(int i=1;no<25;i+=3)
        {
            no+=1;
            sum=i;
            System.out.println("Term "+no+" = "+sum);
        }
    }
    public static void main()
    {
        series8 obj=new series8();
        obj.calc();
    }
}
