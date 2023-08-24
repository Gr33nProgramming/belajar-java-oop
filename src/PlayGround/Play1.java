package PlayGround;

public class Play1 {
    public static void main(String[] args) {
//        CetakAngka cetakPerulangan = new CetakAngka();
//        cetakPerulangan.setAngka(10);
//        CetakAngka.cetak(cetakPerulangan.getAngka());
        CetakAngka cetakCetak = new CetakBilanganGanjil();
        cetakCetak.setAngka(20);
        CetakBilanganGanjil.cetak(cetakCetak.getAngka());
    }
}
class CetakAngka{
    private int angka;
    public int getAngka() {
        return angka;
    }
    public void setAngka(int angka) {
        this.angka = angka;
    }
    static void cetak(int cetakAngka){
        for (int i = 1; i <= cetakAngka; i++) {
            System.out.print(i + " ");
        }
    }
}
class CetakBilanganGanjil extends CetakAngka{
    static void cetak(int cetakAngka){
        for (int i = 1; i <= 20; i+=2) {
            System.out.print(i + " ");
        }
    }
}
class Bintang extends CetakAngka{
    static void cetak(int cetakAngka){
        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }
    }
}