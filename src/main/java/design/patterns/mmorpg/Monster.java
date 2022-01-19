package design.patterns.mmorpg;

public class Monster {
    private String name;
    private String monsterType;
    private int level;

    public Monster(){

    }

    public Monster(String name){
        super();
        this.name = name;
        this.monsterType = "Normal";
        this.level = 1;
    }

    public Monster nameIs(String name){
        this.name = name;
        return this;
    }

    public Monster withType(String monsterType){
        this.monsterType = monsterType;
        return this;
    }

    public Monster onLevel(int monsterLevel){
        this.level = monsterLevel;
        return this;
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

    @Override
    public String toString() {
        return this.name;
    }

}
