package design.patterns.mmorpg;

public class Mage implements Visitable{
    private double health;

    public Mage(double baseHealth){
        this.health = baseHealth;
    }
    
    public double getBaseHealth() {
        return health;
    }

    public double create(Visitor visitor){
        return visitor.getRoleInfo(this) * 0.8;
    }
}
