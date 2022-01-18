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
    
  }
}
