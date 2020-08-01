class question2
{
   String name ; int salary; int tsalary;
   void init(String n, int s)
  {
    name = n;
    salary =s;
    }
   void calc() 
  {
     tsalary = salary + (50*salary)/100;
    }
  void print()
  {
     System.out.print(name);
     System.out.println(" salary is "+tsalary);
   }
  public static void main()
  {
    question2 obj= new question2(); 
    obj. init("bhavya's",12000);
    obj. calc();
    obj. print();
   }
}