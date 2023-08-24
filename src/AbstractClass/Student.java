package AbstractClass;

public abstract class Student {
    String name;
    String nim;
    public abstract void learning(String name);
}
class Informatics extends Student{
    public void learning(String name){
        this.name = name;
        System.out.println(name + " Learning java");
    }
}
