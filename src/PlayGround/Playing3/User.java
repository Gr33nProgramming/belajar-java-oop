package PlayGround.Playing3;

public class User extends Data{
   public void registrasi(String username, String password){
       setUsername(username);
       setPassword(password);
   }
   public String notifikasi(){
       String notif = "Created by User";
       return notif;
   }
}
