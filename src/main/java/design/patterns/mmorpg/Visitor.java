package design.patterns.mmorpg;

public interface Visitor {
    public double getRoleInfo(Warrior warrior);
    public double getRoleInfo(Mage mage);
}
