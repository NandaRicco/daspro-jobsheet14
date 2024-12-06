import java.util.Scanner;

public class Tugas14 {

    static int fungsiRekursif (int [] listAngka, int n){
        if (n == 0){
            return 0;
        } else {
            return listAngka[n-1] + fungsiRekursif(listAngka, n-1);
        }
    }

    static int fungsiIteratif(int [] listAngka){
        int total = 0;
        for (int i = 0; i < listAngka.length; i++){
            total += listAngka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int [] listAngka = new int [n];

        for (int i = n; i > 0; i--){
            System.out.print("Masukkan angka ke-" + i + ": ");
            listAngka[i-1] = sc.nextInt();
        }

        int hasilRekursif = fungsiRekursif(listAngka, n);
        int hasilIteratif = fungsiIteratif(listAngka);

        System.out.println("Total dari " + n + " angka yang di masukkan adalah (Rekursif) : " + fungsiRekursif(listAngka, n));
        System.out.println("Total dari " + n + " angka yang di masukkan adalah (Iteratif) : " + fungsiIteratif(listAngka));
    }
}
