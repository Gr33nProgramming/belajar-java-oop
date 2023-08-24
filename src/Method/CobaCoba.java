package Method;

public class CobaCoba {
    public static void main(String[] args) {
        Phone hp = new Phone();
        hp.setMerk("Samsung");
        hp.setVariant("A50s");
        hp.setHarga(4_000_000);
        System.out.println(hp.getMerk());
        System.out.println(hp.getVariant());
        System.out.println(hp.getHarga());
    }
}
class Phone{
    private String merk;
    private String variant;
    private double harga;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}