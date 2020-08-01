class employee1
{
    int pan; String nm;double TaxIncome; double Tax;
    void input(int PanNumber,String Name,double Tax_Income)
    {
        pan=PanNumber;
        nm=Name;
        TaxIncome=Tax_Income;
    }
    void calc()
    {
        if(TaxIncome<=100000)
        {
           Tax=0.0;
        }
        else if(TaxIncome>=100001 && TaxIncome<=150000)
        {
            Tax=(TaxIncome-100000)*10/100;
        }
        else if(TaxIncome>=150001 && TaxIncome<=250000)
        {
            Tax=((TaxIncome-150000)*20/100)+5000;
        }
        else
        {
            Tax=((TaxIncome-250000)*30/100)+25000;
        }
    }
    void display()
    {
        System.out.println("Pan Number\tName\t   Tax-Income\t   Tax");
        System.out.println(pan+"    \t"+nm+"\t   "+TaxIncome+"\t   "+Tax); 
    }
}