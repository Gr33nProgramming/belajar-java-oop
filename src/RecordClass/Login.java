package RecordClass;

public record Login(String username,String password) {
    public Login{
        System.out.println("LOGIN");
    }
    public Login(String username){
        this(username, " ");
        System.out.println("Please Login");
    }
    public Login(){
        this(" ", "");
    }
}


