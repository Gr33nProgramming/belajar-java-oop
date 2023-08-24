package Interface;

public class LaptopApp {
    public static void main(String[] args) {
        Device laptop = new Acer();
        Acer laptopAcer = new Acer();
        laptop.produk();
        laptop.getProcessor();
        laptopAcer.vgaCard();
        System.out.println("---------");
        Samsung hpSamsung = new Samsung();
        hpSamsung.variant();
        hpSamsung.produk();
        System.out.println(hpSamsung.getProcessor());
        System.out.println(hpSamsung.frontCamera() + " MP");
    }
}
class Acer implements Laptop{
    public void produk(){
        System.out.println("Acer One 14");
    }
    public String getProcessor(){
        return "Intel Core i5";
    }
    public void vgaCard(){
        System.out.println("Intel Graphics");
    }
}
class Samsung implements SmartPhone{

    public void variant() {
        System.out.println("Smart Phone");
    }

    public void produk() {
        System.out.println("Samsung A50s");
    }

    public String getProcessor() {
        return "Exynos";
    }

    public int frontCamera() {
        return 40;
    }
}