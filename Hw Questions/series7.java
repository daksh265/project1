//This is a program that prints the answer for a series
//The series is 4N+1 till 5 terms
class series7
{
    int sum;
    void calc()
    {
        for(int i=1;i<=5;i++)
        {
            sum=(4*i)+1;
            System.out.println("Term "+i+" = "+sum);
        }
    }
    public static void main()
    {
        series7 obj=new series7();
        obj.calc();
    }
}
