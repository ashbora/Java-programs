 class Switch1
 {
    public static void main(String [] args)
    { 
        int d = Integer.parseInt(args[0]);
        String msg = "The name of day is :";
        switch(d)
        {
           case 1 : msg = msg + "Monday";
                    break;
           case 2 : msg = msg + "Tuesday";
                    break;
           case 3 : msg = msg + "Wednesday";
                    break;
           case 4 : msg = msg + "Thursday";
                    break;
           case 5 : msg = msg + "Friday";
                    break;
           case 6 : msg = msg + "Saturday";
                    break;
           case 7 : msg = msg + "Sunday";
                    break;
           default: msg = msg + "*Invalid*";
                    break;        
        }
       System.out.println(msg);
    }
 } 