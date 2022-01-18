package design.patterns.mmorpg;

public class Player {
    private String name;
    private int level;
    private String accountType;
    private static Player player;

    private Player(String name, int level, String accountType){
        this.name = name;
        this.accountType = accountType;
        this.level = level;
    }

    public static Player getDefaultPlayer(String name) {
        if(player != null){
            player.setName(name);
            player.setLevel(1);
            player.setAccountType("Normal");

            return player;
        }
        return new Player(name, 1, "Normal");
    }

    public static Player getAdminPlayer(String name) {
        if(player != null){
            player.setName(name);
            player.setLevel(100);
            player.setAccountType("Admnistrator");
    
            return player;
        }
        return new Player(name, 100, "Admnistrator");
    }

    public String getName() {
        return this.name;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getLevel() {
        return this.level;
    }

    private void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private void setLevel(int level) {
        player.level = level;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
