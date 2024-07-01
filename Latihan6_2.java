import java.util.Scanner;
public class Latihan6_2{
public static void main (String arg[]){
   Scanner in=new Scanner(System.in);
   int nilai;
   String pil;
do{
   System.out.print("Masukkan angka bulat (0 - 100) ");
   nilai=in.nextInt();
   if (nilai>=60){
     if (nilai>=80)
       System.out.println("Nilaimu bagus sekali ");
     else
       System.out.println("Nilaimu bagus ");
   }
   else {
   if (nilai>=30)
     System.out.println("Nilaimu kurang ");
   else
     System.out.println("Nilaimu jelek ");
   }

   System.out.print("Ingin memasukkan lagi? ya/tidak : ");
   pil=in.next();
   }while (pil.equals("ya"));
      System.out.println("Terimakasih");
}
}
