class print_sq
{
    int sq,no;
    void calc()
    {
        labA: for(int i=1;i<10;i++)
        {
            no+=1;
            sq=(int)Math.pow(i,2);
            if(sq%2==0 || sq%3==0 || sq%4==0)
            {
                break labA;
            }
            else
            {
                System.out.println("Term "+no+" = "+sq);
            }
        }
    }
    public static void main()
    {
        print_sq obj=new print_sq();
        obj.calc();
    }
}
