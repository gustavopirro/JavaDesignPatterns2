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
  }
  
}
