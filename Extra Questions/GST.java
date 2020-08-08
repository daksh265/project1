class GST
{
    double R_GST; double CP; double ans; double totalCost;
    GST()
    {
        R_GST=0;
        CP=0;
    }
    GST(double Rate_GSt, double Cost_of_Product)
    {
        R_GST=Rate_GSt;
        CP=Cost_of_Product;
    }
    void calc_GST()
    {
        ans=(R_GST*CP)/100;
        totalCost=CP+ans;
    }
    void print()
    {
        System.out.println("CGST Paid by the dealer is "+ans/2);
        System.out.println("SGST Paid by the dealer is "+ans/2);
        System.out.println("Total Money paid by the dealer is "+totalCost);
    }
    public static void main()
    {
        GST gst1=new GST();
        GST gst2=new GST(18,6000);
        gst2.calc_GST();
        gst2.print();
    }
}