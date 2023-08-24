package PlayGround.Cobacoba;

public class StudentClass {
    private String name;
    private int age, grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    void showData(){

    }
}
class StudentMembers extends StudentClass{
    private String hoby;
    public void setHoby(String hoby){
        this.hoby = hoby;
    }
    public String getHoby(){
        return hoby;
    }
    void showData(){
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Grade : " + getGrade());
        System.out.println("Hoby : " + getHoby());
    }
}