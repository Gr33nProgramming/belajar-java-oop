package EnumClass;

public class RankApp {
    public static void main(String[] args) {
        Player player = new Player();
        player.setRank(Rank.MYTHIC);
        player.setName("Green");
        System.out.println(player.getName());
        System.out.println(player.getRank());
        System.out.println(player.getRank().getDescription());
        String rankName = Rank.LEGEND.name();
        System.out.println(rankName);
        Rank rank = Rank.valueOf("EPIC");
        System.out.println(rank);
        System.out.println("LIST RANK");
        for (var listRank : Rank.values()){
            System.out.println(listRank);
        }
    }
}
class Player{
    private Rank rank;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
