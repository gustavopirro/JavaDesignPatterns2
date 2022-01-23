package design.patterns.mmorpg;

public class App {
  public static void main(String[] args) {

    //Implementation of Static Factory and Singleton Patterns
    Player player = Player.getDefaultPlayer("Player 1");
    Player player2 = Player.getAdminPlayer("Player 2");

    System.out.println(player.getName());
    System.out.println(player2.getName());

    System.out.println(player.getLevel());
    System.out.println(player2.getLevel());

    System.out.println(player.getAccountType());
    System.out.println(player2.getAccountType());
    System.out.println();

    //Implementation of Decorator and Proxy Patterns
    MonsterDAOInterface monsterDAO = new MonsterDAODecorator();

    try{
      monsterDAO.addMonster("");
    } catch(MonsterException e){
      System.err.println(e.getMessage());
    }

    try{
      // DAO removes capitalized string and trailing whitespaces
      System.out.println("Added with sucess: " + monsterDAO.addMonster("             DRAGON              "));
    } catch(MonsterException e){
      System.err.println(e.getMessage());
    }

    try{
      // DAO removes capitalized string and trailing whitespaces and capitalize first letter
      Monster dragon = monsterDAO.getMonster("      drAGon       "); 
      System.out.println("Found on DB: " + dragon.getName());
    } catch(MonsterException e){
      System.err.println(e.getMessage());
    }

    //Implementation of Fluent Interfaces Pattern
    Monster troll = new Monster().nameIs("Troll").withType("Boss").onLevel(100);
    System.out.println();
    System.out.println("Name: " + troll);
    System.out.println("Type: " + troll.getMonsterType());
    System.out.println("Level: " + troll.getLevel());

    //Implementation of Command Pattern
    Receptor msgReceptor = new ReceptorMessage();
    Receptor skillReceptor = new ReceptorSkill();
    Shortcut f2 = new Shortcut("f2");
    Shortcut f3 = new Shortcut("f3");

    System.out.println();
    f2.setCommand(new ShortcutCommand(msgReceptor, "Special Attack"));
    f2.action();

    f3.setCommand(new ShortcutCommand(skillReceptor, "Special Attack"));
    f3.action();

    //Implementation of Flyweight Pattern
    System.out.println();
    GameMap map = new GameMap("Generic Map");
    Monster witch = new Monster("Witch");
    Monster dragon = new Monster("Dragon");

    MonsterInstance witchInstance = new MonsterInstance(witch);
    MonsterInstance witchInstance2 = new MonsterInstance(witch);
    MonsterInstance dragonInstance = new MonsterInstance(dragon);

    map.spawnMonster(witchInstance);
    map.spawnMonster(witchInstance2);
    map.spawnMonster(dragonInstance);

    System.out.println("Map name: " + map.getMapname());
    System.out.println("Map available monsters: " + map.getMonsters());
    System.out.println("Monster instance list:");
    System.out.println("Name - Coordinates");
    for(MonsterInstance instance : map.getMonstersList().values())
      System.out.println(instance);

    //Impementation of Facade Pattern
    System.out.println();
    DbFacadeDAO facadeDAO = new DbFacadeDAO();

      //Find monster with facade
    try{
      System.out.println(facadeDAO.getMonster("Skeleton"));
    } catch (MonsterException e){
      System.err.println(e);
    }

      //Add monster with facade
    facadeDAO.addMonster("Orc");
    try{
      System.out.println(facadeDAO.getMonster("Orc"));
    } catch(MonsterException e){
      System.err.println(e);
    }

      //Add monster with DAO Decorator and retrieve with facade
    try{
      new MonsterDAODecorator().addMonster("Blood Elf");
      System.out.println(facadeDAO.getMonster("Blood elf"));
    } catch(MonsterException e){
      System.err.println(e);
    }

      //Try to find invalid input
    try{
      System.out.println(facadeDAO.getMonster("Invalid Input!"));
    } catch(MonsterException e){
      System.err.println(e);
    }
  } 

}
