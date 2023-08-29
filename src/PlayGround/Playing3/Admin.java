package PlayGround.Playing3;

public class Admin extends User{
    private User user;
    Admin(User user){
        this.user = user;
    }
   public void registrasi(String username, String password){
       setUsername(username);
       setPassword(password);
   }
   public String notifikasi(){
       String notif = "Created by Admin";
       return notif;
   }
   public void registrasiUser(String username, String password){
       user.setUsername(username);
       user.setPassword(password);
   }
}
