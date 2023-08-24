package ThisSuperKeyword;

public class Manager {
    String name;
    Manager(String name){
        this.name = name;
    }
}
class Employee extends Manager{
    Employee(String name){
        super(name);
    }
}
