package creature;

public interface Creature {
    public abstract boolean isAlive();
    public abstract void showStatus();
    public abstract void attack(Creature target);
    public abstract String getName();
    public abstract int getHp();
    public abstract void setHp(int hp);
}
