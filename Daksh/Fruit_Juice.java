 class Fruit_Juice
{
    int Product_Code; String Flavour; String Pack_Type; int Pack_Size; int Product_prize;
    Fruit_Juice()
    {
        Product_Code=0; 
        Flavour="";
        Pack_Type=""; 
        Pack_Size=0;  
        Product_prize=0;
    }
    void input()
    {
        Product_Code=132472; 
        Flavour="Mango";
        Pack_Type="Tetra Pack"; 
        Pack_Size=500;  
        Product_prize=150;
    }
    void discount()
    {
        Product_prize-=10;
    }
    void display()
    {
        System.out.println("The Product Code is "+ Product_Code);
        System.out.println("The Flavour is "+ Flavour);
        System.out.println("The Pack Type is "+ Pack_Type);
        System.out.println("The Pack Size is "+ Pack_Size);
        System.out.println("The Product prize is "+ Product_prize);
    }
}