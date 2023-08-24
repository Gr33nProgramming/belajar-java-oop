package PlayGround.Playing1;

public class Jseries extends Samsung{
    private String realease;
    private final Brand Brand;
    Jseries(Brand samsung){
        this.Brand = samsung;
    }

    public String getRealease() {
        return realease;
    }

    public void setRealease(String realease) {
        this.realease = realease;
    }
}
