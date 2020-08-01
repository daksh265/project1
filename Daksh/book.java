 class book
{
    String Code; String Tittle; double Price;
    book()
    {
        Code="";
        Tittle="";
        Price=0.00;
    } 
    book(String code, String tittle, double price)
    {
        Code=code;
        Tittle=tittle;
        Price=price;
    }
    String getCode()
    {
        return Code;
    }
    String getTittle()
    {
        return Tittle;
    }
    double getPrice()
    {
        return Price;
    }
    public static void main()
    {
        book B1=new book();
        book B2=new book("Fict101","Harry Poter",449.0);
        System.out.println("The Code is "+B2.getCode());
        System.out.println("The Tittle is "+B2.getTittle());
        System.out.println("The Price is "+B2.getPrice());
    }
}