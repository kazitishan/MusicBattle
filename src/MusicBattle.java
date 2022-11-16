public class MusicBattle {
    String userCharacter;
    String compCharacter;
    int userHealth = 100;
    int compHealth = 100;

    MusicBattle(int num) {
        if (num == 1) userCharacter = "Playboi Carti";
        if (num == 2) userCharacter = "A$AP Rocky";
        if (num == 3) userCharacter = "21 Savage";
    }

    public void setCompCharacter() {
        int random = (int) ((Math.random() * 3) + 1);
        if (random == 1) compCharacter = "Drake";
        if (random == 2) compCharacter = "Kanye West";
        if (random == 3) compCharacter = "Ice Spice";
    }

    public String getUserCharacter() {
        return userCharacter;
    }

    public String getCompCharacter() { return compCharacter;}

    public int getUserHealth() { return userHealth; }

    public int getCompHealth() { return compHealth; }

    public String userAttackOptions() {
        String options = "";
        if (userCharacter.equals("Playboi Carti")) {
            options += " 1. Throw adlibs bomb \n 2. Call Pierre Bourne for help \n 3. Metamorphasize \n 4. Take shirt off";
        }
        if (userCharacter.equals("A$AP Rocky")) {
            options += " 1. Call the A$AP Mob \n 2. Use Tylers flower bomb \n 3. Umbrella-ella-ella \n 4. Cloud Storm";
        }
        if (userCharacter.equals("21 Savage")) {
            options += " 1. Call Metro Boomin for help \n 2. ";
        }
        return options;
    }

    public String userAttack(int num) {
        String attack = "You chose to ";
        if (userCharacter.equals("Playboi Carti")) {
            if (num == 1) attack += "throw Adlibs bomb \nWHAT SLATT PUSH SLATT WHAT!";
            if (num == 2) {
                attack += "call Pierre Bourne for help \nPierre has come out here and punched the opponent";
            }
            if (num == 3) {
                attack += "metamorphasize \nPlayboi Carti has metamorphasized into a vampire and sucked the enemies blood";
            }
            if (num == 4) {
                attack += "take shirt off \n" + compCharacter + " has stopped breathing";
            }
        }
        if (userCharacter.equals("A$AP Rocky")) {
            if (num == 1) {
                attack += "call the A$AP Mob \n";
            }
            if (num == 2) {
                attack += "use Tylers flower bomb \n";
            }
            if (num == 3) {
                attack += " \n";
            }
            if (num == 4) {
                attack += " \n";
            }
        }
        if (userCharacter.equals("21 Savage")) {
            if (num == 1) {
                attack += "call Metro Boomin for help \n";
            }
            if (num == 2) {
                attack += " \n";
            }
            if (num == 3) {
                attack += " \n";
            }
            if (num == 4) {
                attack += " \n";
            }
        }
        return attack;
    }

    public String compAttack() {
        int random = (int) ((Math.random() * 4) + 1);
        String attack = compCharacter + " has decided to ";
        if (compCharacter.equals("Drake")) {
            if (random == 1) {
                attack += "call Future for help \n";
            }
            if (random == 2) {
                attack += "turn into 2018 Drake \n";
            }
            if (random == 3) {
                attack += " \n";
            }
            if (random == 4) {
                attack += " \n";
            }
        }
        if (userCharacter.equals("Kanye West")) {
            if (random == 1) {
                attack += " \n";
            }
            if (random == 2) {
                attack += " \n";
            }
            if (random == 3) {
                attack += " \n";
            }
            if (random == 4) {
                attack += " \n";
            }
        }
        if (userCharacter.equals("Ice Spice")) {
            if (random == 1) {
                attack += "do the Munch \n";
            }
            if (random == 2) {
                attack += "do a headbutt \n";
            }
            if (random == 3) {
                attack += " \n";
            }
            if (random == 4) {
                attack += " \n";
            }
        }
        return attack;
    }

    public int damageDealt() {
        int damage = (int) ((Math.random() * 50) + 1);
        return damage;
    }

    public String damageLine(String character) {
        String line = "";
        String opponent = "";
        int damage = damageDealt();
        // damage against this character
        if (character.equals(userCharacter)) {
            if (userHealth - damage <= 0) {
                damage = userHealth;
                userHealth = 0;
            }
            else userHealth -= damage;
            opponent = compCharacter;
        }
        if (character.equals(compCharacter)) {
            if (compHealth - damage <= 0) {
                damage = compHealth;
                compHealth = 0;
            }
            else compHealth -= damage;
            opponent = userCharacter;
        }
        if (damage >= 40) {
            line += opponent + " has inflicted MASSIVE damage on " + character + " (-" + damage + ")\n";
        }
        else if (damage >= 30){
            line += opponent + " has inflicted a lot of damage on " + character + " (-" + damage + ")\n";
        }
        else if (damage >= 20){
            line += opponent + " has inflicted a decent amount of damage on " + character + " (-" + damage + ")\n";
        }
        else if (damage >= 10){
            line += opponent + " has inflicted light damage on " + character + " (-" + damage + ")\n";
        }
        else if (damage > 0) {
            line += opponent + " BARELY did any damage to " + character + " (-" + damage + ")\n";
        }
        else if (damage == 0){
            line += opponent + " didn't even touch " + character + " move LMAO" + "\n";
        }
        if (userHealth == 0) {line += compCharacter + " has defeated " + userCharacter;}
        if (compHealth == 0) {line += userCharacter + " has defeated " + compCharacter;}
        return line;
    }

    public boolean gameContinuing(){
        if (userHealth == 0 || compHealth == 0) return false;
        return true;
    }

    private boolean userWon(){
        if (compHealth == 0) return true;
        else return false;
    }

    public String battleStatus(){
        if (userWon()) return "You Won!";
        else return "You Lost!";
    }
}
