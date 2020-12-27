
package tgs.ke.pkg09;

public class NegaraKota {

    public static void main(String[] args) {
        String[][] irul = new String[7][4];
        
        irul[0][0] = "Ibukota";
        irul[1][0] = "Ibukota";
        irul[2][0] = "Ibukota";
        irul[3][0] = "Ibukota";
        irul[4][0] = "Ibukota";
        irul[5][0] = "Ibukota";
        irul[6][0] = "Ibukota";
        
        irul[0][1] = "Indonesia";
        irul[1][1] = "Jepang";
        irul[2][1] = "Iran";
        irul[3][1] = "Amerika";
        irul[4][1] = "Inggris";
        irul[5][1] = "Perancis";
        irul[6][1] = "Irak";
        
        irul[0][2] = "adalah";
        irul[1][2] = "adalah";
        irul[2][2] = "adalah";
        irul[3][2] = "adalah";
        irul[4][2] = "adalah";
        irul[5][2] = "adalah";
        irul[6][2] = "adalah";
        
        irul[0][3] = "Jakarta";
        irul[1][3] = "Tokyo";
        irul[2][3] = "Teheran";
        irul[3][3] = "Bekasi";
        irul[4][3] = "Bantar Gebang";
       
        int i, j;
        for (i=0; i<3; i++) {
            for (j=0; j<4; j++)
                System.out.print(irul[i][j] +" ");
            System.out.println(" ");
        }   
    }
    
}