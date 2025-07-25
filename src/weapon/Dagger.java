package weapon;

public class Dagger extends Weapon{
    public Dagger(String weapon, int damage) {
        super("短剣", 6);
    }

    public String attackMessage() {
        return "で素早く切りつけた！";
    }
}
