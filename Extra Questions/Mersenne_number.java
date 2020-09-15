class Mersenne_number
{
    int time,sum;
    void calc()
    {
        labA:for(int i=1;sum<250;i++)
        {
            sum=(int)Math.pow(2,i)-1;
            time=0;
            labB:for(int j=2;j<sum;j++)
            { 
                if(sum%j==0)
                {
                    time+=1;
                }
                else
                {

                }
            }
            if(time!=0)
            {
                continue labA;
            }
            else
            {
                System.out.println(sum);
            }
        }
    }
    public static void main()
    {
        Mersenne_number obj=new Mersenne_number();
        obj.calc();
    }
}