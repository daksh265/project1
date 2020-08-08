// This program is 5th Question of the board project
class question7
{
    String n; int roll; int math; int sci; int eng; int comp; int his; double per; int sum; int mark; int total;
    void init(String name,int rollNo,int maths,int science,int english,int computer,int history,int marks)
    {
        n = name;
        roll = rollNo;
        math = maths;
        sci = science;
        eng = english;
        his = history;
        mark = marks;
    }
    void calc()
    {
        sum = math+sci+eng+comp+his;
        total = mark*5;
        per = (sum*100)/total;
    }
    void print()
    {
        if(per<=90)
        {
            System.out.println("Science with Computers");
        }
        else if(80<=per && per<=89)
        {
            System.out.println("Science without Computers");
        }
        else if(70<=per && per<=79)
        {
             System.out.println("Commerce with Maths");
            }
        else
        {
             System.out.println("Commerce without Maths");
            }
        }    
     public static void main()
    {
       question7 obj= new question7(); 
       obj. init("Daksh",24,95,90,100,74,76,100);
       obj. calc();
       obj. print();
        }
    }