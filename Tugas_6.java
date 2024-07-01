import java.util.Scanner;
public class Tugas_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String Jen, MK;
        int JumlahSKS = 0;
        int sks[] = new int[100];
        System.out.print("Jenjang(D3/S1): ");
        Jen = in.next();
        if (Jen.equals("D3")) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Mata Kuliah : ");
                MK = in.next();
                System.out.print("SKS :");
                sks[i] = in.nextInt();
            }
            for (int x = 1; x <= 3; x++) {
                JumlahSKS += sks[x];
            }

            System.out.println("Total SKS : " + JumlahSKS);
        } else if (Jen.equals("S1")) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Mata Kuliah : ");
                MK = in.next();
                System.out.print("SKS :");
                sks[i] = in.nextInt();
            }
            for (int x = 1; x <= 5; x++) {
                JumlahSKS += sks[x];
            }
            System.out.println("Total SKS : " + JumlahSKS);
        } else {
            System.out.println("Salah Masukkan Jenjang");
        }
    }
}
