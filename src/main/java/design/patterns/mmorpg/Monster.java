package design.patterns.mmorpg;

public class Monster {
    private String name;
    private String monsterType;
    private int level;

    public Monster(String name){
        super();
        this.name = name;
        this.monsterType = "Normal";
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public int getLevel() {
        return level;
    }

}
