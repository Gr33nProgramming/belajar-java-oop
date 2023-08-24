package PlayGround.CobaPolymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.setNama("Yazid");
        parent.doCall();

    }
}
class Parent{
    private String nama;
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void doCall(){
        System.out.println("Halo " + getNama());
    }
}
class Child extends Parent{
    private String nim;

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void doCall(String nim){
        this.nim = nim;
        System.out.println("Halo " + getNama() + getNim());
    }
}
