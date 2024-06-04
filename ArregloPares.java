import java.io.*;
public class ArregloPares{
    public static void Arreglo6x6() {
        int[][] matriz = new int[6][6];
        int num = 2;

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                matriz[i][j]= num;
                num = num + 2;
            }
        }
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}