package Class;

public class CobaCoba2 {
    public static void main(String[] args) {
        var dataPerson = new Person();
        dataPerson.setNama("Yazid");
        dataPerson.setUmur(18);
        dataPerson.setTinggiBadan(171.0f);
        dataPerson.setBeratBadan(50.5f);
        System.out.println("Nama\t\t : " + dataPerson.getNama());
        System.out.println("Usia\t\t : " + dataPerson.getUmur());
        System.out.println("Tinggi badan : " + dataPerson.getTinggiBadan());
        System.out.println("Berat badan\t : " + dataPerson.getBeratBadan());
    }
}
class Person{
    private String nama;
    private int umur;
    private float tinggiBadan;
    private float beratBadan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public float getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(float tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public float getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(float beratBadan) {
        this.beratBadan = beratBadan;
    }
}