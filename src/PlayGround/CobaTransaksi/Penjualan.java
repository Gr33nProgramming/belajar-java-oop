package PlayGround.CobaTransaksi;

public interface Penjualan {
    void tambahBarang(String namaBarang,String jenisBarang,Integer hargaBarang);
    void hapusBarang();
    default void kelolaBarang(){

    }
}
