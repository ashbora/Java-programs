 /* use of final method */
 class First
 {
    final void show()   //final method
    { System.out.println("Inside class First show method"); }
 }
 class Second extends First
 {
    void show()    //method overriding-Error - can not override final method
    { System.out.println("Inside class Second show method");}
 }
 class Inh12
 {
    public static void main(String [] args)
    {
       Second s = new Second();
       s.show();
    }
 } 