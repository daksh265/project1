//This program prints hello and the name of the user
class basic1
{
    void print()
    {
        System.out.println("Hello");
    }
    void name(String name)
    {
        System.out.println(name);
    }
    public static void main()
    {
        basic1 obj =new basic1();
        obj.print();
        obj.name("Daksh");
    }
}