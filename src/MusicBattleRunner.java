import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MusicBattleRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String RESET = "\u001B[0m";
        System.out.print(BLUE + " 1. Playboi Carti \n 2. A$AP Rocky \n 3. Kanye West \n" + RESET + "Which character would you like to choose: ");
        int chosenCharacter = s.nextInt();
        MusicBattle battle = new MusicBattle(chosenCharacter);
        battle.setCompCharacter();
        String user = battle.getUserCharacter();
        String opponent = battle.getCompCharacter();
        System.out.println(PURPLE + "\n" + user + " was strolling the streets of New York until he came across a wild " + opponent);
        System.out.println(opponent + " looked at him dead in the eyes and they both knew they wanted to fight " + RESET);
        System.out.println(RED + "FIGHT! \n" + RESET);
        boolean userTurn = true;
        while (battle.gameContinuing()){
            if (userTurn){
                System.out.println(BLUE + battle.userAttackOptions() + RESET);
                System.out.print("What attack would you like to choose: ");
                int chosenAttack = s.nextInt();
                System.out.println(PURPLE + "\n" + battle.userAttack(chosenAttack) + "\n" + RESET);
                System.out.println(battle.damageLine(opponent));
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (userTurn == false){
                System.out.println(PURPLE + "It is now " + opponent + "'s turn");
                System.out.println(battle.compAttack() + RESET);
                System.out.println(battle.damageLine(user));
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(GREEN + battle.getBothHealth() + "\n" + RESET);
            if (userTurn == true) userTurn = false;
            else userTurn = true;
        }
        if (battle.userWon()) System.out.println(GREEN + "You Won!" + RESET);
        else System.out.println(RED + "You Lost!" + RESET);
    }
}
