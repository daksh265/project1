//This is a HW question that converts a value to absolute value
//It uses ternary operator for the conversion
class Ternary
{
    int k,a;
    void init(int i)
    {
        k=i;
    }
    void chk()
    {
        a=k<0?-k:k; // for extracting the absolute value of the variable 
    }
    void print()
    {
        System.out.println("The absolute value of the variable is "+a);
    }
    public static void main(int i)
    {
        Ternary obj=new Ternary();
        obj. init(i);
        obj. chk();
        obj. print();
    }
}
