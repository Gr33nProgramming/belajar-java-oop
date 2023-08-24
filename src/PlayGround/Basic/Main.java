package PlayGround.Basic;

public class Main {
    public static void main(String[] args) {
        cetakAngka(20);
        int k = 10 ^ 2;
        System.out.println(k);
    }
    private static void cetakAngka(int value){
        for (int i = 1; i <= value; i++) {
            if(i % 9 == 0){
                System.out.println(i + ".Waduh ");
            }else if(i % 4 == 0 && i % 6 == 0){
                System.out.println(i + ".Wamduh ");
            }else{
                System.out.println(i);
            }
        }
    }
}
