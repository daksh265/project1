class Section_Formula
{
    double X1,X2,Y1,Y2,M1,M2,x,y;
    Section_Formula()
    {
        X1=0;
        X2=0;
        Y1=0;
        Y2=0;
        M1=0;
        M2=0;
    }
    Section_Formula(double x1,double x2,double y1,double y2,double m1,double m2)
    {
        X1=x1;
        X2=x2;
        Y1=y1;
        Y2=y2;
        M1=m1;
        M2=m2;
    }
    void calc_Ans()
     {
        x=(M1*X2+M2*X1)/(M1+M2);
        y=(M1*Y2+M2*Y1)/(M1+M2);
    }
    void Print()
    {
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
    }
    public static void main()
    {
        Section_Formula SF= new Section_Formula();
        Section_Formula S_F=new Section_Formula(1,5,3,9,1,2);
        S_F.calc_Ans();
        S_F.Print();
    }
}