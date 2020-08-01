class student
{
    String nm; int ag; double m1; double m2; double m3;double max; double avg;
    student()
    {
        String nm="";
        int ag=0;
        double m1=0; 
        double m2=0; 
        double m3=0; 
        double max=0; 
        double avg=0;
    }
    student(String name, int age, double marks1, double marks2, double marks3)
    {
        nm=name;
        ag=age;
        m1=marks1; 
        m2=marks2; 
        m3=marks3; 
    }
    double compute()
    {
        avg=(m1+m2+m3)/3;
        if(m1>m2 && m1>m3)
        {
            max=m1;
            return max;
        }
        else if(m2>m1 && m2>m3)
        {
            max=m2;
            return max;
        }
        else if(m3>m2 && m3>m1)
        {
            max=m3;
            return max;
        }
        else
        {
            
        }
        return max;
    }
    void Print()
    {
        System.out.println("Name of the student is "+nm);
        System.out.println("Students First subect marks is "+m1);
        System.out.println("Students Second subect marks is "+m2);
        System.out.println("Students Third subect marks is "+m3);
        System.out.println("The average of the student is "+avg);
        if(m1==m2 && m2==m3)
        {
             System.out.println("All the marks of the student are equal ");
        }
        else
        {
            System.out.println("All the maximum marks of the student is "+max);
        }
    }
    public static void main()
    {
        student s1=new student();
        student s2=new student("Daksh",14,94.0,94.0,94.0);
        s2.compute();
        s2.Print();
    }
}