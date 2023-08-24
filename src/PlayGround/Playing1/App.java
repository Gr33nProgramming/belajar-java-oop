package PlayGround.Playing1;

public class App {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        Jseries jseries = new Jseries(samsung);
        jseries.ipAddress();
    }
}
