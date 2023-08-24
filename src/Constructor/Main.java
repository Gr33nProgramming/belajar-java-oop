package Constructor;

import java.util.*;
import java.util.function.LongFunction;


public class Main {
    public static void main(String[] args) {
        Mahasiswa constructor = new Mahasiswa();

    }
}
class Mahasiswa{
    String nama;
    Long nim;
    String prodi;
    Mahasiswa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        this.nama = input.nextLine();
        System.out.print("NIM : ");
        this.nim = input.nextLong();input.nextLine();
        System.out.print("Program Studi : ");
        this.prodi = input.nextLine();
        System.out.println("=========================");
        System.out.println("Nama : " + nama.toUpperCase());
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : " + prodi.toUpperCase());
        System.out.println("=========================");

    }
}
