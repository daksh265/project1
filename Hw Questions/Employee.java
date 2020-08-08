class Employee
{
    double basic_Pay; double Dearness_Allowance; double House_Rent_Allowance; double Net_Pay; double Provident_Fund; double Gross_Pay;
    String name;
    Employee()
    {
        basic_Pay=0;
        name="";
    }
    Employee(String Name,double Basic_Pay)
    {
        basic_Pay=Basic_Pay;
        name=Name;
    }
    double Get_basic_Pay()
    {
        Dearness_Allowance=(25*basic_Pay)/100;
        return basic_Pay;
    }
    double Dearness_Allowance()
    {
        Dearness_Allowance=(25*basic_Pay)/100;
        return Dearness_Allowance;
    }
    double House_Rent_Allowance()
    {
        House_Rent_Allowance=(15*basic_Pay)/100;
        return House_Rent_Allowance;
    }
    double Provident_Fund()
    {
        Provident_Fund=(8.33*basic_Pay)/100;
        return Provident_Fund;
    }
    double Net_Pay()
    {
        Net_Pay = basic_Pay + Dearness_Allowance + House_Rent_Allowance;
        return Net_Pay;
    }
    double Gross_Pay()
    {
        Gross_Pay = Net_Pay-Provident_Fund;
        return Gross_Pay;
    }
    String Employee_Name()
    {
        return name;
    }
}