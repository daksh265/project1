class constructor
{
    int bal;
    constructor()
    {
        System.out.println("Hello");
    }
    double cons(int no)
    {
        bal=no;
        return bal;
    }
    public static void main()
    {
        constructor my_constructor=new constructor();
        my_constructor.cons(5273);
    }
}