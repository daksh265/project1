class Get_Employee
{
    public static void main(String Name,double Basic_Pay)
    {
        Employee E1=new Employee();
        Employee E2=new Employee(Name, Basic_Pay);
        System.out.println("The Name of the employee is "+E2.Employee_Name());
        System.out.println("The Basic Pay of the employee is "+E2.Get_basic_Pay());
        System.out.println("The Dearness Allowance of the employee is "+E2.Dearness_Allowance());
        System.out.println("The House Rent Allowance of the employee is "+E2.House_Rent_Allowance());
        System.out.println("The Provident Fund of the employee is "+E2.Provident_Fund());
        System.out.println("The Net Pay of the employee is "+E2.Net_Pay());
        System.out.println("The Gross Pay of the employee is "+E2.Gross_Pay());
    }
}