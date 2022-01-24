package design.patterns.mmorpg;

public class Role implements Visitor{

    public double getRoleInfo(Mage mage) {
        return mage.getBaseHealth();
    }

    public double getRoleInfo(Warrior warrior){
        return warrior.getBaseHealth();
    }

}
