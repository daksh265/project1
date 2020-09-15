//This is a program that prints the answer for a series
//The series is 3n+1 till 20 terms
class series9
{
    int sum,no;
    void calc()
    {
        labA: for(int i=0;i<20;i++)
        {
            no+=1;
            sum=(3*i)+2;
            if(sum%4==0)
            {
                break labA;
            }
            else
            {
                System.out.println("Term "+no+" = "+sum);
            }
        }
    }
    public static void main()
    {
        series9 obj=new series9();
        obj.calc();
    }
}
