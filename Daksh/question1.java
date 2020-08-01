class question1
{
   int a; int b; int c; int d; int e; int f; int g; int h; int i;int j;
   void init()
   {
      a=1;
      b=2;
      c=3;
      d=4;
      e=5;
      f=6;
      g=7;
      h=8;
      i=9;
      j=10;
    }
     void print()
     { 
      System.out.println(a);
      System.out.println(b+""+c);
      System.out.println(d+""+e+""+f);
      System.out.println(g+""+h+""+i+""+j);
   }   
   public static void main()
   {
      question1 obj= new question1();
      obj.init();
      obj.print();
    }
}