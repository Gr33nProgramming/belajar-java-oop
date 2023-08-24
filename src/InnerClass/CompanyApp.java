package InnerClass;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        Company.Employee employee = company.new Employee();

        company.setName("Green Programming");
        employee.setName("Yazid Bintang");
        System.out.println(company.getName());
        System.out.println("--------------");
        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

    }
}
