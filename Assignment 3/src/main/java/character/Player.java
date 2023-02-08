package character;

import weapon.*;

public abstract class Player extends Character {

    // Player properties
    Weapon playerWeapon;

    // Constructor
    public Player(String name, int[] stats, Weapon playerWeapon) {
        super(name, stats);
        this.playerWeapon = playerWeapon;
    }

    @Override
    public String toString() {
        return String.format("""
                        Player: %s
                        --------------------
                        Class: %s
                        HP: %d                  Defense: %d     Agility: %d     Base Attack: %d
                        %s
                        """,
                super.getName(),
                super.getClass().getSimpleName(),
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getBaseAttack(),
                playerWeapon.toString()
        );

    }


    //----------------------------------------------------------------------------------------------
    //---------------------------------GETTERS AND SETTERS------------------------------------------
    //----------------------------------------------------------------------------------------------

    public Weapon getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(Weapon playerWeapon) {
        this.playerWeapon = playerWeapon;
    }
}
