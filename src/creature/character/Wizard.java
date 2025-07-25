package creature.character;

public class Wizard extends Character{
    private int mp;

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.setMp(mp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 3);
        this.setMp(this.getMp() - 1);
    }
}
