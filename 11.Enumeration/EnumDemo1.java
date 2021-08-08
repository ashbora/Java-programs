enum WebBrowsers
{IE,FireFox,Chrome,Safari,Opera}

class EnumDemo1
{
  public static void main(String args[])
  { 
       System.out.println(WebBrowsers.FireFox);
       WebBrowsers wb = WebBrowsers.Chrome;
       System.out.println("Value of wb = "+wb);
  }
}