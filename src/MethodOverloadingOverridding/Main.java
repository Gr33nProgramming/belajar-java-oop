package MethodOverloadingOverridding;

public class Main {
    public static void main(String[] args) {
        OverLoading sumLoading = new OverLoading();
        OverRidding sumRidding = new OverRidding();

        System.out.println("Summary pertama " + sumLoading.summary(2, 4));
        System.out.println("Summary kedua " + sumLoading.summary(4,6,8));
        System.out.println("Summary overridding pertama " + sumRidding.summary(5, 10));
        System.out.println("Summary overridding kedua " + sumRidding.summary(6,10,4));
    }
}
class OverLoading{
    int value1;
    int value2;
    int value3;
    int hasil;
    int summary(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
        this.hasil = value1 + value2;

        return hasil;
    }
    int summary(int value1, int value2, int value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.hasil = value1 + value2 + value3;
        return hasil;
    }
}
class OverRidding extends OverLoading{
    int summary(int value1, int value2){
        this.hasil = value1 + value2;
        return hasil;
    }
    int summary(int value1, int value2, int value3){
        this.hasil = value1 + value2 + value3;
        return hasil;
    }
}