package AnonymousClass.LambdaExpression;

public class ButtonApp {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setAction(() -> {
            System.out.println("Tombol diKlik ! ");
        });
        btn.doClick();
    }
}
