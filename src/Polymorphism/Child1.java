package Polymorphism;

public class Child1 implements Root{
    public void checkName(){
        System.out.println("Name");
    }
    public void checkName(Root paramRoot){
        System.out.println(paramRoot);
    }
}
