package design.patterns.mmorpg;

public class MonsterDAODecorator implements MonsterDAOInterface {
    private static MonsterDAOInterface monsterDAO;

    private MonsterDAOInterface getDAO(){
        if(monsterDAO == null)
            monsterDAO = new MonsterDAOProxy();
        return monsterDAO;
    }

    public String addMonster(String name) throws MonsterException {
        name = validateName(name);
        getDAO().addMonster(name);
        return name;
    }

    public Monster getMonster(String name) throws MonsterException {
        name = validateName(name);
        Monster m = getDAO().getMonster(name);
        if(m == null)
            throw new MonsterException("Monster name not found");
        return m;
    }

    private String validateName(String name) throws MonsterException {
        if(name.isBlank())
            throw new MonsterException("Monster name paramater cannot be Blank");
        
        name = name.strip().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        return name;
    }
    


}
