import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingMod4_Prak7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int b=3;int d=3; //matrik 3 baris 3 kolom
        System.out.println("Masukan Nilai Matrix:");
        int[][] matrix1=new int[b][d];
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                try {
                    matrix1[i][j]=input();
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    input.next(); // Mengabaikan input yang tidak valid
                }
            }
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }
}