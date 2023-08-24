package AnonymousClass;

public interface Voice {
    void sayHello();
    static void sayHello(String word){
        System.out.println("Hello " + word);
    }
}

