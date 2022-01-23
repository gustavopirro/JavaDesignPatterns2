package design.patterns.mmorpg;
import java.util.Map;

public class DbFacadeDAO {
    MonsterDAOInterface monsterDAO;

    public DbFacadeDAO(){ 
        this.monsterDAO = new MonsterDAODecorator();
    }

    public String getMonster(String monsterName) throws MonsterException {
        PostgresDAO.getPostgresDB();
        try{
            Map.Entry<Integer, String> entry = PostgresDAO.getMonster(monsterName);
            return entry.getValue();
        } catch(MonsterException e){
            Monster monsterQuery = monsterDAO.getMonster(monsterName);
            return monsterQuery.getName();
        }
           
    }

    public void addMonster(String monsterName) {
        try{
            this.monsterDAO.addMonster(monsterName);
        } catch(MonsterException e) {
            System.err.println(e);
        }
    }

}
