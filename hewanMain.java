import java.util.Scanner;

public class hewanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataHewan list = new dataHewan();
        System.out.println("falah");
        do {
            System.out.println("== Menu ==");
            System.out.println("1. Tambahkan Hewan");
            System.out.println("2. tampilkan Daftar hewan");
            System.out.println("3. Urutkan berdasarkan umur hewan");
            System.out.println("4. Cari Detail Hewan Dengan Id");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                
                case 1:
                    System.out.print("Masukkan id hewan: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama Hewan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Hewan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Umur Hewan: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    list.tambah(new hewan(id, nama, jenis, umur));
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.sortingDSC();
                    break;
                case 4:
                    System.out.print("Masukkan id yang dicari:");
                    String cari = sc.nextLine();
                    list.pencarianDataSequential(cari);
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    return;
                default:
                    System.out.println("Pilihan Menu Tidak Tersedia");
                    break;
            }
        } while (true);

    }
}
