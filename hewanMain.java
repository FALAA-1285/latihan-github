import java.util.Scanner;

public class hewanMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hewan hewan[][]=new hewan[4][100];
        do{
            System.out.println("== Menu ==");
            System.out.println("1. Tambahkan Hewan");
            System.out.println("2. tampilkan Daftar hewan");
            System.out.println("3. Urutkan berdasarkan jenis hewan");
            System.out.println("4. Cari Detail Hewan Dengan Id");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Menu: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;    
                case 5:
                System.out.println("Terima Kasih");
                return;
                default:
                System.out.println("Pilihan Menu Tidak Tersedia");
                    break;
            }
        }while(true);

        
    }
}
