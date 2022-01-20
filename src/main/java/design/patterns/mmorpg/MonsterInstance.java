package design.patterns.mmorpg;

import java.util.HashMap;

public class MonsterInstance {
    Monster monster;
    HashMap<String, Integer> coordenates;

    public MonsterInstance(Monster monster){
        this.coordenates = new HashMap<>();
        this.monster = monster;
        this.coordenates.put("X", Utils.getRandomNumber(0, 200));
        this.coordenates.put("Y", Utils.getRandomNumber(0, 200));
    }

    public HashMap<String, Integer> getCoordenates() {
        return coordenates;
    }

    public Monster getMonster() {
        return monster;
    }

    @Override
    public String toString() {
        return this.monster.getName() + " - " + this.coordenates.get("X") + "/" + coordenates.get("Y");
    }
}
