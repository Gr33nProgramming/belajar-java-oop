package CobaOOP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var playerMainObject = new Player();
        ArrayList<Integer> chooseStorage = new ArrayList<>();
        String confirmInput;
        var player1MainObject = new Player1();
        var player2MainObject = new Player2();
        var player3MainObject = new Player3();
        do{
            try{
                System.out.println("Player 1 ");
                System.out.println("Player 2 ");
                System.out.println("Player 3");
                System.out.print("Pilih Player : ");
                var playerInput = input.nextInt();input.nextLine();
                chooseStorage.add(playerInput);
                if(playerInput == 1){
                    player1MainObject.Player1Method();
                    player1MainObject.PlayerMethod();
                }else if(playerInput == 2){
                    player2MainObject.Player2Method();
                    player2MainObject.PlayerMethod();
                }else if(playerInput == 3){
                    player3MainObject.Player3Method();
                    player3MainObject.PlayerMethod();
                }
                System.out.print("Continue ? (y / n) : ");
            }catch(Exception e){
                System.err.println("\nMasukkan Angka ! ");
            }
            confirmInput = input.nextLine();
            if(confirmInput.equalsIgnoreCase("n")) break;
        }while(confirmInput.equalsIgnoreCase("y"));
        for(int i = 0; i < chooseStorage.size(); i++){
            System.out.println("Pilihan anda Player " + (i + 1));
        }
    }
}
class Player{
    public String nickName;
    public Integer hp;
    public Integer xp;
    public Integer attPower;
    public Integer deffPower;

     void PlayerMethod(){
        System.out.println("Nick Name : " + this.nickName);
        System.out.println("Health Power : " + this.hp);
        System.out.println("Experience Point : " + this.xp);
        System.out.println("Attack Power : " + this.attPower);
        System.out.println("Defend Power : " + this.deffPower);
    }
}
class Player1 extends Player{
    void Player1Method(){
        super.nickName = "Green";
        super.hp = 100;
        super.xp = 500;
        super.attPower = 1000;
        super.deffPower = 87;
    }
    @Override
    void PlayerMethod() {
        super.PlayerMethod();
    }
}
class Player2 extends Player{
    void Player2Method(){
        super.nickName = "Yellow";
        super.hp = 60;
        super.xp = 300;
        super.attPower = 600;
        super.deffPower = 400;
    }
    void PlayerMethod(){
        super.PlayerMethod();
    }
}
class Player3 extends Player{
    void Player3Method(){
        super.nickName = "Blues";
        super.hp = 80;
        super.xp = 100;
        super.attPower = 3000;
        super.deffPower = 500;
    }
    void PlayerMethod(){
        super.PlayerMethod();
    }
}

