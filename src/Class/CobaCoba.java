package Class;

import java.util.*;

class Cto{
    String nama;
    String address;
    String email;
    void sayHello(String nama){
        System.out.println("Hello " + nama + ", My Name is " + this.nama);
    }
}
class Manager extends Cto{

}

class Data{
    String nama = "";
    String namaPanjang = "";
    final String negara = "Indonesia";
    Data(){
        nama = "Yazid";
        System.out.println(nama);
        System.out.println(negara);
    }
    Data(String paramNama, String paramNamaPanjang){
        nama = paramNama;
        namaPanjang = paramNamaPanjang;
    }
    Data(String paramNama){
        this(paramNama, null);
    }
    void DataRespon(String parameterNama){
        System.out.printf("Hello %s, My Name is %s \n", parameterNama,nama);
    }
}

public class CobaCoba {
    public static void main(String[] args) {
        var alamat = "";
        var input = new Scanner(System.in);
        alamat = input.nextLine();
        var objectData = new Data();
        var objectData2 = new Data("Bintang");
        System.out.print("Masukkan nama : ");
        String inputNama = input.nextLine();
        objectData.DataRespon(inputNama);

        var objectCto = new Cto();
        var objectManager = new Manager();
        objectCto.nama = "Yazid";
        objectManager.nama = "Bintang";
    }
}
