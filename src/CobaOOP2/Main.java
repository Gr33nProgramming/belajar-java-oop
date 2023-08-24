package CobaOOP2;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        var calc = new Kalkulator();
        System.out.println(calc.calculation(1,2,"+"));
    }
}
class Kalkulator{
    Integer firstNumber;
    Integer secondNumber;
    String operation;
    long result;

    long calculation(Integer firstNumber, Integer secondNumber, String operation){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        switch (operation) {
            case "+" -> {
                this.result = (long) this.firstNumber + this.secondNumber;
                return this.result;
            }
            case "-" -> {
                this.result = (long) this.firstNumber - this.secondNumber;
                return this.result;
            }
            case "*" -> {
                this.result = (long) this.firstNumber * this.secondNumber;
                return this.result;
            }
            case "/" -> {
                this.result = (long) this.firstNumber / this.secondNumber;
                return this.result;
            }
            default -> System.err.println("Error !");
        }
        return result;
    }
}
