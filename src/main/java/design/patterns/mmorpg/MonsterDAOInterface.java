package design.patterns.mmorpg;

public interface MonsterDAOInterface {

    public String addMonster(String name) throws MonsterException;

    public Monster getMonster(String name) throws MonsterException;
}