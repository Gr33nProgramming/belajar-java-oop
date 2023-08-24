package PlayGround.Mahasiswa;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Yazid","2255201202","Teknik Informatika",3.86F);
        mahasiswa.tampilkanData();
        System.out.println(((mahasiswa.isLulus()) ? "LULUS" : "Tidak LULUS"));
    }
}
