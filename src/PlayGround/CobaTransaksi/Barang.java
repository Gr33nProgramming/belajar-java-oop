package PlayGround.CobaTransaksi;

public class Barang extends DataBarang implements Penjualan{
    @Override
    public void tambahBarang(String namaBarang,String jenisBarang, Integer hargabarang) {
        super.setNamaBarang(namaBarang);
        var getNamaBarang = super.getNamaBarang();
        super.setJenisBarang(jenisBarang);
        var getJenisBarang = super.getJenisBarang();
        super.setHargaBarang(hargabarang);
        var getHargaBarang = super.getHargaBarang();
        System.out.println("Nama Barang\t\t: " + getNamaBarang);
        System.out.println("Jenis Barang\t: " + getJenisBarang);
        System.out.println("Harga Barang\t: Rp" + getHargaBarang);
        System.out.println("Barang berhasil ditambah");
    }
    @Override
    public void hapusBarang() {
        System.out.println("Barang berhasil dihapus");
    }
    public void kelolaBarang(){
        System.out.println("Kelola barang selesai");
    }
}
