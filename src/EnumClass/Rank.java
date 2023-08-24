package EnumClass;

public enum Rank {
    EPIC("Epic Rank"),
    LEGEND("Legend Rank"),
    MYTHIC("Mythic Rank");
    private String description;
    Rank(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
