class Mid_Pt_Formula
{
    double X1,X2,Y1,Y2,x,y;
    Mid_Pt_Formula()
    {
        X1=0;
        X2=0;
        Y1=0;
        Y2=0;
    }
    Mid_Pt_Formula(double x1,double x2,double y1,double y2)
    {
        X1=x1;
        X2=x2;
        Y1=y1;
        Y2=y2;
    }
    void calc_Ans()
     {
        x=(X1+X2)/(2);
        y=(Y2+Y1)/(2);
    }
    void Print()
    {
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
    }
    public static void main()
    {
        Mid_Pt_Formula MF= new Mid_Pt_Formula();
        Mid_Pt_Formula M_F=new Mid_Pt_Formula(4.0,-2.0,-6.0,4.0);
        M_F.calc_Ans();
        M_F.Print();
    }
}