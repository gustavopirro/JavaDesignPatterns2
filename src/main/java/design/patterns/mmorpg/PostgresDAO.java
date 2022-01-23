package design.patterns.mmorpg;

import java.util.HashMap;
import java.util.Map;

class PostgresDAO {
    private static HashMap<Integer, String> postgresDB;

    public static HashMap<Integer, String> getPostgresDB() {
        if(postgresDB == null){
            postgresDB = new HashMap<>();
                
            postgresDB.put(1, "Skeleton");
            postgresDB.put(2, "Minotaur");
            postgresDB.put(3, "Goblin");

        }
        return postgresDB;
    }

    public static Map.Entry<Integer, String> getMonster(String monsterName) throws MonsterException {
        for (Map.Entry<Integer, String> entry : postgresDB.entrySet()){
            if(monsterName == entry.getValue())
                return entry;
        }

        throw new MonsterException("Monster Not found!");
    }
}