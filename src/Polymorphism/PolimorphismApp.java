package Polymorphism;

public class PolimorphismApp {
    public static void main(String[] args) {
        Child1 root = new Child1();
        root.checkName();
        root.checkName(root);
    }
}
