package design.patterns.mmorpg;

public class Warrior implements Visitable {
    private double health;

    public Warrior(double baseHealth){
        this.health = baseHealth;
    }

    public double getBaseHealth() {
        return health;
    }

    public double create(Visitor visitor){
        return visitor.getRoleInfo(this) * 1.5;
    }
}
