package AnonymousClass;

public class ButtonApp {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol berhasil diKlik !");
            }
        });
        btn.doClick();
    }
}
