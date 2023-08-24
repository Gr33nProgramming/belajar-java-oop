package ThisSuperKeyword;

public class This {
    private String name;
    private Integer umur;
    public This(String name){
        this.name = name;
        System.out.println(name);

    }
}
class ThisDua extends This{
    private String alamat;
    public ThisDua(String name){
        super(name);

    }
}
