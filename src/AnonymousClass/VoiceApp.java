package AnonymousClass;

public class VoiceApp {
    public static void main(String[] args) {

        Voice english = new Voice(){
            public void sayHello(){
                System.out.println("hello 1");
            }
            public void sayHello(String word){
                System.out.println("Hello 2" + word);
            }
        };
        english.sayHello();
        Voice.sayHello("Yazid");
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors + " core");
    }
}
