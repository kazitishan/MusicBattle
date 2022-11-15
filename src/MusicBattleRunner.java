import java.util.Scanner;
public class MusicBattleRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" 1. Playboi Carti \n 2. A$AP Rocky \n 3. 21 Savage \nWhich character would you like to choose: ");
        int chosenCharacter = s.nextInt();
        MusicBattle m = new MusicBattle(chosenCharacter);
        m.setCompCharacter();
        String user = m.getUserCharacter();
        String opponent = m.getCompCharacter();
        System.out.println("\n" + user + " was strolling the streets of New York until he came across a wild " + opponent);
        System.out.println(opponent + " looked at him dead in the eyes and they both knew they wanted to fight ");
        System.out.println("FIGHT! \n");
        boolean userTurn = true;
        while (m.gameContinuing()){
            if (userTurn){
                System.out.println(m.userAttackOptions());
                System.out.print("What attack would you like to choose: ");
                int chosenAttack = s.nextInt();
                System.out.println("\n" + m.userAttack(chosenAttack) + "\n");
                System.out.println(m.damageLine(opponent));
            }
            if (userTurn == false){
                System.out.println("It is now " + opponent + "'s turn");
                System.out.println(m.compAttack());
                System.out.println(m.damageLine(user));
            }
            System.out.println(user + " health: " + m.getUserHealth() + "\n" + opponent + " health: " + m.getCompHealth() + "\n");
            if (userTurn == true) userTurn = false;
            else userTurn = true;
        }




    }
}
