package PlayGround.Mahasiswa;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private Float ipk;

    Mahasiswa(String nama, String nim, String jurusan, Float ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    public void tampilkanData(){
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Jurusan\t: " + jurusan);
        System.out.println("IPK\t\t: " + ipk);
    }
    public boolean isLulus(){
        return ipk >= 2.75F;
    }

}
