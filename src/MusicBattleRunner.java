import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MusicBattleRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" 1. Playboi Carti \n 2. A$AP Rocky \n 3. 21 Savage \nWhich character would you like to choose: ");
        int chosenCharacter = s.nextInt();
        MusicBattle battle = new MusicBattle(chosenCharacter);
        battle.setCompCharacter();
        String user = battle.getUserCharacter();
        String opponent = battle.getCompCharacter();
        System.out.println("\n" + user + " was strolling the streets of New York until he came across a wild " + opponent);
        System.out.println(opponent + " looked at him dead in the eyes and they both knew they wanted to fight ");
        System.out.println("FIGHT! \n");
        boolean userTurn = true;
        while (battle.gameContinuing()){
            if (userTurn){
                System.out.println(battle.userAttackOptions());
                System.out.print("What attack would you like to choose: ");
                int chosenAttack = s.nextInt();
                System.out.println("\n" + battle.userAttack(chosenAttack) + "\n");
                System.out.println(battle.damageLine(opponent));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (userTurn == false){
                System.out.println("It is now " + opponent + "'s turn");
                System.out.println(battle.compAttack());
                System.out.println(battle.damageLine(user));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(user + " health: " + battle.getUserHealth() + "\n" + opponent + " health: " + battle.getCompHealth() + "\n");
            if (userTurn == true) userTurn = false;
            else userTurn = true;
        }
        System.out.println(battle.battleStatus());
    }
}
