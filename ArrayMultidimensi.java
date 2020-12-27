package tgs.ke.pkg09;

public class ArrayMultidimensi {
    
    public static void main(String[] args) {
        int[][] piksel = new int[5][3];
        piksel[0][1] = 70;
        piksel[1][1] = 18;
        piksel[1][2] = 45;
        piksel[2][1] = 75;
        piksel[3][1] = 66;
        piksel[4][0] = 89;
        
        int i, j;
        for (i=0;i<5;i++){
            for (j=0;j<3;j++)
                System.out.print(piksel[i][j]+" ");
             System.out.println(" ");

    }
    }
}
