public class MusicBattle {
    String userCharacter;
    String compCharacter;
    int userHealth = 100;
    int compHealth = 100;

    MusicBattle(int num){
        if (num == 1) userCharacter = "Playboi Carti";
        if (num == 2) userCharacter = "Frank Ocean";
        if (num == 3) userCharacter = "Tyler The Creator";
        if (num == 4) userCharacter = "A$AP Rocky";
        if (num == 5) userCharacter = "21 Savage";
    }

    public void setCompCharacter(){
        int random = (int) ((Math.random() * 5) + 1);
        if (random == 1) compCharacter = "Drake";
        if (random == 2) compCharacter = "Lil Pump";
        if (random == 3) compCharacter = "6ix 9ine";
        if (random == 4) compCharacter = "Kanye West";
        if (random == 5) compCharacter = "Ice Spice";
    }

    public String getUserCharacter(){
        return userCharacter;
    }

    public String getCompCharacter(){
        return compCharacter;
    }

    public String userAttackOptions(){
        if (userCharacter.equals("Playboi Carti")){
            return " 1. Adlibs bomb \n 2. Call Pierre Bourne for help \n 3. WAKE UP F1LTHY \n 4. Stop Breathing \n 5. Bald Magic";
        }
        if (userCharacter.equals("Frank Ocean")){
            return " 1. ";
        }
        if (userCharacter.equals("Tyler The Creator")){
            return " 1. Flower Bomb \n 2. ";
        }
        if (userCharacter.equals("A$AP Rocky")){
            return " 1. Call the A$AP Mob \n 2. Rihanna \n 3. tbd \n 4. tbd \n 5. tbd";
        }
        if (userCharacter.equals("21 Savage")){
            return " 1. Call Metro Boomin for help \n 2. ";
        }
        return null;
    }
}
