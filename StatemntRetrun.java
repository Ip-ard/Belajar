
package tgs.pkg08;

public class StatemntRetrun {

    public static void main(String[] args) {
           
      yahoo(true);
      System.out.println("hallo");
   }
   public static void yahoo(boolean a)   {
      System.out.println("1");
      if (a)
      {
         return;
      }
      System.out.println("2");
      System.out.println("3");
   }
}


