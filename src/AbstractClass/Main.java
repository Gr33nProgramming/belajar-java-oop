package AbstractClass;

public class Main {
    public static void main(String[] args) {
        car vehicleCar = new car();

    }
}
abstract class vehicle{
    private String name;
    private String company;
    private String variant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    void explain(String name, String company, String variant){
        setName(name);
        setCompany(company);
        setVariant(variant);

    }
}
class car extends vehicle{
    void explain(){
        super.explain("Car", "Volvo", "Truck");
    }
}
