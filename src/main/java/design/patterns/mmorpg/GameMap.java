package design.patterns.mmorpg;

import java.util.HashMap;
import java.util.HashSet;

public class GameMap {
    private String mapname;
    private HashSet<Monster> monsters;
    private HashMap<Integer, MonsterInstance> monsterInstances;
    private int monsterId;

    public GameMap(String mapName){
        this.monsterInstances = new HashMap<>();
        this.monsters = new HashSet<>();
        this.mapname = mapName;
        this.monsterId = 0;
    }

    public String getMapname() {
        return mapname;
    }

    public HashSet<Monster> getMonsters() {
        return monsters;
    }

    private void addMonster(Monster m){
        this.monsters.add(m);
    }

    public void spawnMonster(MonsterInstance monterInfo){
        if(monsters.contains(monterInfo.monster) == false)
            addMonster(monterInfo.monster);

        this.monsterInstances.put(monsterId, monterInfo);
        this.monsterId += 1;
    }

    public HashMap<Integer, MonsterInstance> getMonstersList() {
        return monsterInstances;
    }
}
