public class bookStore
{
    public static void main()
    {
        book book1=new book("Tech101","Learning Java",200.00);  
        book book2=new book("Fict101","Harry Potter",350.00); 
        book book3=new book("Myth101","Philosophy of Faith",524.00);
        //This space is left to make the code easy to understand
        System.out.println("Book1 Details");
        System.out.println("Code is "+book1.getCode());
        System.out.println("Tittle is "+book1.getTittle());
        System.out.println("Price is "+book1.getPrice());
        //This space is left to make the code easy to understand
        System.out.println("Book2 Details");
        System.out.println("Code is "+book2.getCode());
        System.out.println("Tittle is "+book2.getTittle());
        System.out.println("Price is "+book2.getPrice());
        //This space is left to make the code easy to understand
        System.out.println("Book3 Details");
        System.out.println("Code is "+book3.getCode());
        System.out.println("Tittle is "+book3.getTittle());
        System.out.println("Price is "+book3.getPrice()); 
    }
}  