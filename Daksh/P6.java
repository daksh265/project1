class P6
{
    String name; double per;
    void init(String Name, double percentage)
    {
        name=Name;
        per=percentage;
    }
    void Display_grades()
    {
        System.out.println("Name of the Student is "+name);
        System.out.println("Percentage maks obtained by the student is "+per);
        if(per>=90 && per<=100)
        {
            System.out.println("The grade obtaineed by the student is A ");
        }
        else if(per>=80 && per<=100)
        {
            System.out.println("The grade obtaineed by the student is B ");
        }
        else if(per>=40 && per<=100)
        {
            System.out.println("The grade obtaineed by the student is C ");
        }
        else if(per>=0 && per<=100)
        {
            System.out.println("The grade obtaineed by the student is D ");
        }
        else
        {
            System.out.println("Invalid Percentage value");
        }
    }
    public static void main(String Name, double percentage)
    {
        P6 obj=new P6();
        obj. init(Name,percentage);
        obj. Display_grades();
    }
}