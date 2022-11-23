public class MusicBattle {
    String userCharacter;
    String compCharacter;
    int userHealth = 100;
    int compHealth = 100;

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";

    /**
     * Based on the value of num userCharacter will be set to the associated character with num
     * @param num - inputted by the user to choose which character they would like to continue as
     */
    MusicBattle(int num) {
        if (num == 1) userCharacter = "Playboi Carti";
        if (num == 2) userCharacter = "A$AP Rocky";
        if (num == 3) userCharacter = "Kanye West";
    }

    /**
     * Generates a random number between 1 and 3 and based on that random number
     * compCharacter will be set to the character associated with that number
     */
    public void setCompCharacter() {
        int random = (int) ((Math.random() * 3) + 1);
        if (random == 1) compCharacter = "Drake";
        if (random == 2) compCharacter = "Taylor Swift";
        if (random == 3) compCharacter = "Ice Spice";
    }

    /**
     * Returns userCharacter to set the user in the MusicBattleRunner class
     * @return - userCharacter
     */
    public String getUserCharacter() {
        return userCharacter;
    }

    /**
     * Returns compCharacter to set the opponent in the MusicBattleRunner class
     * @return - compCharacter
     */
    public String getCompCharacter() { return compCharacter;}

    /**
     * Based on the string literal of userCharacter,
     * options will be set to the attack options of the character the user chose
     * @return - options, contains the attack options of the user
     */
    public String userAttackOptions() {
        String options = "";
        if (userCharacter.equals("Playboi Carti")) {
            options += " 1. Throw adlibs bomb \n 2. Call Pierre Bourne for help \n 3. Metamorphasize \n 4. Take shirt off";
        }
        if (userCharacter.equals("A$AP Rocky")) {
            options += " 1. Call the A$AP Mob \n 2. Use Tylers flower bomb \n 3. Umbrella-ella-ella Magic\n 4. Cloud Storm";
        }
        if (userCharacter.equals("Kanye West")) {
            options += " 1. Call Pusha T \n 2. Throw Yeezys \n 3. Run for President \n 4. Drop out of college";
        }
        return options;
    }

    /**
     * The user will see the attack options, then make a choice on which attack they would like to play
     * the number is inputted in the parameter of this method and will return the attack the user chose
     * @param num - represents the attack number the user chose
     * @return - attack, the attack corresponding to num
     */
    public String userAttack(int num) {
        String attack = "You chose to ";
        if (userCharacter.equals("Playboi Carti")) {
            if (num == 1) attack += "throw Adlibs bomb \nWHAT SLATT PUSH SLATT WHAT JUMPOUTTHEHOUSE!";
            if (num == 2) attack += "call Pierre Bourne for help \nPierre has come out here and punched " + compCharacter;
            if (num == 3) attack += "metamorphasize \nPlayboi Carti has metamorphasized into a vampire and sucked " + compCharacter + "'s blood";
            if (num == 4) attack += "take shirt off \n" + compCharacter + " has stopped breathing";
        }
        if (userCharacter.equals("A$AP Rocky")) {
            if (num == 1) attack += "call the A$AP Mob \nThe A$AP mob have arrived in black suits and try to intimidate " + compCharacter;
            if (num == 2) attack += "use Tylers flower bomb \nThe pollen gets in " + compCharacter + "'s nose and attack's their organs";
            if (num == 3) attack += "use the Umbrella-ella-ella Magic \nRihanna has summoned and has batted " + compCharacter + " with her Umbrella";
            if (num == 4) attack += "use the Cloud Storm \nA$AP Rocky rubs his hands together and releases a cloud storm towards " + compCharacter;
        }
        if (userCharacter.equals("Kanye West")) {
            if (num == 1) attack += "call Pusha T \nPusha T tries to scare " + compCharacter + " by sneaking up behind them";
            if (num == 2) attack += "throw Yeezys \nKanye West pulls out a Yeezy shoe from his pocket and throws it at" + compCharacter;
            if (num == 3) attack += "run for president \nKanye West spits out the red, white, and blue onto " + compCharacter;
            if (num == 4) attack += "drop out of college \nKanye West pulls out his College Dropout bear suit and jumps on " + compCharacter;
        }
        return attack;
    }

    /**
     * Generates a random number between 1 and 4 and based on that random number and the string literal of compCharacter
     * a random attack will be returned
     * @return - attack, the attack used by the computer
     */
    public String compAttack() {
        int random = (int) ((Math.random() * 4) + 1);
        String attack = compCharacter + " has decided to ";
        if (compCharacter.equals("Drake")) {
            if (random == 1) attack += "call Future for help \nFuture turns into Jumpman and jumps " + userCharacter;
            if (random == 2) attack += "turn into 2018 Drake \nDrake has gotten Gods Plan and uses it";
            if (random == 3) attack += "ask 21 Savage to do something for him \n21 Savage hit a lil rich flex and talked to the opps necks";
            if (random == 4) attack += "use Passionfruit bomb \nThe bomb explodes juice all over " + userCharacter;
        }
        if (compCharacter.equals("Taylor Swift")) {
            if (random == 1) attack += "call Lana Del Ray for help \nTaylor Swift and Lana Del Ray scream as loud as they can";
            if (random == 2) attack += "use Miley Cyrus' wrecking ball \nTaylor Swift came in like a wrecking ball";
            if (random == 3) attack += "be even more annoying \nTaylor Swift drops another album";
            if (random == 4) attack += "remember the night Kanye West embarrassed her \nTaylor builds up so much anger and has punched " + userCharacter;
        }
        if (compCharacter.equals("Ice Spice")) {
            if (random == 1) attack += "do the Munch \nIce Spice does the munch in an attempt to blind " + userCharacter;
            if (random == 2) attack += "do a headbutt \nIce Spice takes 100 steps back and charges her head towards " + userCharacter;
            if (random == 3) attack += "pull out the Nike Tech \nIce Spice blasts plasma out of the Nike Tech";
            if (random == 4) attack += "call her friends from the Bronx \nThey all throw punches at " + userCharacter;
        }
        return attack;
    }

    /**
     * Generates a random number between 0 and 50 and sets it to damage
     * This method is used in another method
     * @return - damage, represents the amount of damage inflicted by user or comp
     */
    private int damageDealt() {
        int damage = (int) ((Math.random() * 50) + 1);
        return damage;
    }

    /**
     * Uses the damageDealt method to generate a random number between 0 and 100 and sets it to damage which is initialized to an int.
     * Based on the character inputed in the parameter, the health of that character will be updated by subtracting damage from the health
     * Then a line will be returned based on the value of damage
     * If a condition is met that one of the characters health is 0, another line is returned of which character defeated which character.
     * @param character - The character that is getting inflicted with damage
     * @return - line, may contain many lines
     */
    public String damageLine(String character) {
        String line = "";
        String opponent = "";
        int damage = damageDealt();
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
        if (damage >= 40) line += opponent + " has inflicted MASSIVE damage on " + character + RED + " (-" + damage + ")\n" + RESET;
        else if (damage >= 30) line += opponent + " has inflicted a lot of damage on " + character + RED + " (-" + damage + ")\n" + RESET;
        else if (damage >= 20) line += opponent + " has inflicted a decent amount of damage on " + character + RED + " (-" + damage + ")\n" + RESET;
        else if (damage >= 10) line += opponent + " has inflicted light damage on " + character + RED + " (-" + damage + ")\n" + RESET;
        else if (damage > 0) line += opponent + " BARELY did any damage to " + character + RED + " (-" + damage + ")\n" + RESET;
        else if (damage == 0) line += opponent + " didn't even touch " + character + " LMAO" + "\n";
        if (userHealth == 0) line += compCharacter + " has defeated " + userCharacter;
        if (compHealth == 0) line += userCharacter + " has defeated " + compCharacter;
        return line;
    }

    /**
     * Is used in the while loop in the MusicBattleRunner class to loop the game
     * @return - Returns false if any of the characters get to 0 health, and returns true if otherwise
     */
    public boolean gameContinuing(){
        if (userHealth == 0 || compHealth == 0) return false;
        return true;
    }

    /**
     * Is used in MusicBattleRunner class
     * @return - Returns true if compHealth is 0, and returns false if otherwise
     */
    public boolean userWon(){
        if (compHealth == 0) return true;
        else return false;
    }

    /**
     * Used in the MusicBattleRunner class to display the health of both characters
     * @return - Returns the health of both characters in string form
     */
    public String getBothHealth(){
        return userCharacter + " health: " + userHealth + "\n" + compCharacter + " health: " + compHealth;
    }
}
