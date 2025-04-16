public class hewan{
    String id;
    String nama;
    String jenis;
    int umur;

    public hewan(){

    }

    public hewan(String id, String nama, String jenis, int umur){
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    void tampil(){
        System.out.println("Id    : " + id);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Umur  : " + umur);
    } 
}
