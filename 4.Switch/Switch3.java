 class Switch3
 {
    public static void main(String [] args)
    { 
        int yr = Integer.parseInt(args[0]);
        int py = yr-1;
        int tnd = py*365;
        int tld = py/4 - py/100 + py/400;
        int td = tnd+tld;
        int d = td%7;
        String msg = "The day on 1 January "+yr+" :";
        switch(d)
        {
           case 0 : msg = msg + "Monday";
                    break;
           case 1 : msg = msg + "Tuesday";
                    break;
           case 2 : msg = msg + "Wednesday";
                    break;
           case 3 : msg = msg + "Thursday";
                    break;
           case 4 : msg = msg + "Friday";
                    break;
           case 5 : msg = msg + "Saturday";
                    break;
           case 6 : msg = msg + "Sunday";
                    break;
        }
       System.out.println(msg);
    }
 } 