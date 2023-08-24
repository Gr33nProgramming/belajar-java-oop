package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Data personData = new Data();
        personData.setId(202200);
        personData.setId(null);
        personData.setName("Yazid Bintang Fathurrahman");
        personData.setAddress("Tangerang");
        System.out.println(personData.getId());
        System.out.println(personData.getName());
        System.out.println(personData.getAddress());
    }
}
class Data{
    private Integer id;
    private String name;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id != null){
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
