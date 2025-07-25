package weapon;

public class Wand extends Weapon{
    public Wand(String weapon, int damage) {
        super("魔法の杖", 15);
    }

    public String attackMessage() {
        return "から魔法を放った！";
    }
}
