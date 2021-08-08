 class Publication
 {
   String title;
   float price;
   
   Publication(String title,float price)
   {
     this.title=title;
     this.price=price; 
   }
   void display()
   {
     System.out.println("Title            :"+title);
     System.out.println("Price            :"+price);  
   }
 }
 class Book extends Publication
 {
   int page_count;
   Book(String title,float price,int page_count)
   {
     super(title,price);
     this.page_count = page_count;
   }
   void display()
   {
     super.display();
     System.out.println("Total pages      :"+page_count);   
   }
 }
 class Tape extends Publication
 {
   float playing_time;
   Tape(String title,float price,float playing_time)
   {
     super(title,price);
     this.playing_time = playing_time;
   }
   void display()
   {
     super.display();
     System.out.println("Playing time     :"+playing_time);   
   }
 }
 class Inh8
 {
    public static void main(String [] args)
    {
        Book book = new Book("Java Complete Reference",415.0f,1408);
        Tape tape = new Tape("Memory techniques",83.20f,43.20f);
        System.out.println("Book details\n---------------------------");
        book.display();
        System.out.println("\n\nTape details\n---------------------------");
        tape.display();
    }
 }
  
