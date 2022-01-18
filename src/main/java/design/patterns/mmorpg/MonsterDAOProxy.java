package design.patterns.mmorpg;

import java.util.HashMap;
import java.util.Map;

public class MonsterDAOProxy implements MonsterDAOInterface {
    private Map<String, Monster> monstersDB;

    public MonsterDAOProxy() {
        super();
        this.monstersDB = new HashMap<>();
    }

    public String addMonster(String name) {
        this.monstersDB.put(name, new Monster(name));
        return name;
    }

    public Monster getMonster(String name) {
        return this.monstersDB.get(name);
    }




}
