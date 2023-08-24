package PlayGround.Cobacoba;

public class Admin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void registrasi(String username,String password){
        this.username = username;
        this.password = password;
        System.out.println("Berhasil diregistrasi");
    }
    void notifikasi(){
        System.out.println("Created by Admin");
    }
}
class user extends Admin{
    void registrasi(String username, String password){

    }
    void notifikasi(){
        System.out.println("Created by User");
    }
}