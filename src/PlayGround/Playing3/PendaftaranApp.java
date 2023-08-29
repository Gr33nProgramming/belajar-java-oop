package PlayGround.Playing3;

import java.util.Scanner;

public class PendaftaranApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Admin admin = new Admin(user);
        System.out.println("Selamat Datang");
        System.out.println("--------------");
        System.out.println("1. User\n2. Admin");
        System.out.print("Masukkan pilihan\t: ");
        int pilihan = scanner.nextInt();scanner.nextLine();
        if(pilihan == 1){
            System.out.println("Silahkan buat akun");
            System.out.print("Username\t: ");
            String usernameUser = scanner.nextLine();
            System.out.print("Password\t: ");
            String passwordUser = scanner.nextLine();
            user.registrasi(usernameUser, passwordUser);
            System.out.println("Username\t: " + user.getUsername());
            System.out.println("Password\t: " + user.getPassword());
            System.out.println(user.notifikasi());
        }else if(pilihan == 2){
            System.out.print("Silahkan buat akun (1. User / 2. Admin)\t: ");
            int pilihanAdmin = scanner.nextInt();scanner.nextLine();
            if(pilihanAdmin == 1){
                System.out.println("Silahkan buat akun");
                System.out.print("Username\t: ");
                String usernameUser = scanner.nextLine();
                System.out.print("Password\t: ");
                String passwordUser = scanner.nextLine();
                admin.registrasiUser(usernameUser, passwordUser);
                System.out.println("Username\t: " + user.getUsername());
                System.out.println("Password\t: " + user.getPassword());
                System.out.println(admin.notifikasi());
            }else if(pilihanAdmin == 2){
                System.out.println("Silahkan buat akun");
                System.out.print("Username\t: ");
                String usernameAdmin = scanner.nextLine();
                System.out.print("Password\t: ");
                String passwordAdmin = scanner.nextLine();
                admin.registrasi(usernameAdmin, passwordAdmin);
                System.out.println("Username\t: " + admin.getUsername());
                System.out.println("Password\t: " + admin.getPassword());
                System.out.println(admin.notifikasi());
            }else{
                System.err.println("Ooops !");
            }
        }else{
            System.err.println("Ooops !");
        }
    }
}
