 class Switch2
 {
   public static void main(String [] args)       
   {
      int m = Integer.parseInt(args[0]);
      String msg = "";
      switch(m)
      {
        case 3:
        case 4:
        case 5: msg = "Season : Summer";
                break;
 
        case 6:
        case 7:
        case 8: msg = "Season : Mansoon";
                break;
        case 9: 
        case 10:
        case 11: msg = "Season : Post Mansoon";
                 break;
        case 12:
        case 1:
        case 2:  msg="Season : Winter";
                 break;

        default: msg = "Bogus month";
      }
      System.out.println(msg);
   }
 }