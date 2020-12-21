
package tgs.pkg08;

public class StatementBreak {

    public static void main(String[] args) {
        boolean a=true;
        m:
        {
            n:
            {
                o:
                {
                    System.out.println("Before break");
                    if(a)
                        break n;
                    System.out.println("This will not execiute");
                }
            }   System.out.println("After break");
        }
    }
}
