package Class;

class Mahasiswa{
    String nama;
    
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa classMahasiswa = new Mahasiswa();

        classMahasiswa.nama = "Yazid";
        String namaMahasiswa = classMahasiswa.nama;
        System.out.println("Nama : " + namaMahasiswa);

        Mahasiswa classMahasiswa2 = new Mahasiswa();

        classMahasiswa2.nama = "Bintang";
        namaMahasiswa = classMahasiswa2.nama;
        System.out.println("Nama : " + namaMahasiswa);
    }
}
