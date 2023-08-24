package RecordClass;

import javax.swing.*;

public class LoginApp {
    public static void main(String[] args) {
        Login loginApp = new Login("Green","Programming");

        System.out.println("Username : " + loginApp.username());
        System.out.println("Password : " + loginApp.password());
        System.out.println(new Login("Blue"));
//        System.out.println(new Login());
        Login loginConstructor = new Login();
        System.out.println(loginConstructor.password());
    }
}
