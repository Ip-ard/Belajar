
package tgs.pkg08;

public class StatemntContinue {

    public static void main(String[] args) {
        int [] id = {999, 888, 777, 666, 555,};
        for(int x : id)
        {
            if( x == 777 )
            {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
                        
            }
        }
    }

