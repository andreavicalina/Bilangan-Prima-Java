package bilanganprima;

//memasukkan paket scanner
import java.util.Scanner;

//nama file harus sama dengan nama fungsi
public class test {
    public static void main(String args[])
    {
        
        // berfungsi untuk mencetak hasil dari data-data
        Scanner input = new Scanner(System.in);

         System.out.print("Masukkan nilai : ");
         //memasukkan nilai untuk tipe data integer
         int n=input.nextInt();

         System.out.println("Bilangan Prima dari 1 -  " +n);

         //proses perulangan untuk mencari bilangan prima dengan batas terentu(n)
         for (int i=1; i<=n; i++){
            int cek=0;
            for (int j=1;j<=n;j++){
                if (i%j==0){
                    cek++;
                }
            }
            if ((cek==2)&&(i!=1)){
                System.out.print(i+" ");
            }             
        }     

   }
}