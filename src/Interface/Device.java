package Interface;

public interface Device {
    default void variant(){
        System.out.println();
    }
    void produk();
    String getProcessor();
}
interface Laptop extends Device{
    void vgaCard();
}
interface SmartPhone extends Device{
    int frontCamera();
}

